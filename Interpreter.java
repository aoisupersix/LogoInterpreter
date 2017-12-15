import java.util.HashMap;
import java.util.Stack;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Interpreter {

    private Turtle turtle;
    private HashMap<String, Double> globalStore; //変数の管理用HashMap
    private Stack<Double> repCounts; //繰り返し回数の管理
    private HashMap<String, Tree> procedures; //手続きの管理
    private Stack<HashMap<String, Double>> localStores; //ローカル変数の管理
    private boolean stopped;

    public Interpreter() {
        turtle = new Turtle(150, 150, 0, true);
        globalStore = new HashMap<String, Double>();
        repCounts = new Stack<Double>();
        procedures = new HashMap<String, Tree>();
        localStores = new Stack<HashMap<String, Double>>();
        stopped = false;
    }

    /**
     * 構文木の評価
     * @param stats 構文木のルートノード
     */
    public void interp(Tree stats) {
        execStats(stats);
        turtle.dumpSVG();
    }

    /**
     * 複文の評価
     * @param stats 複文の構文木
     */
    private void execStats(Tree stats){
        if(stats.getType() == LogoParser.COMPOUND){
            execStat(stats.getChild(0));
            execStats(stats.getChild(1));
        }else if(stats.getType() == LogoParser.SIMPLE){
            execStat(stats.getChild(0));
        }
    }

    /**
     * 単文の評価
     * @param stat 単文の構文木
     */
    private void execStat(Tree stat) {
        if(stopped){
            //手続きの中断。処理を行わない
            return;
        }
        switch(stat.getType()) {
            case LogoParser.FORWARD:
                turtle.forward(calcExpr(stat.getChild(0)));
                break;
            case LogoParser.RIGHT:
                turtle.turn(calcExpr(stat.getChild(0)));
                break;
            case LogoParser.LEFT:
                turtle.turn(-calcExpr(stat.getChild(0)));
                break;
            case LogoParser.BACK:
                turtle.forward(-calcExpr(stat.getChild(0)));
                break;
            case LogoParser.PENUP:
                turtle.penUp();
                break;
            case LogoParser.PENDOWN:
                turtle.penDown();
                break;
            case LogoParser.REPEAT:
                double repNum = calcExpr(stat.getChild(0));
                for(double i = 1; i <= repNum; i++){
                    //REPCOUNTを追加してstatsを実行する。
                    repCounts.push(i);
                    execStats(stat.getChild(1));
                    repCounts.pop();
                }
                break;
            case LogoParser.MAKE:
                //もしローカル変数が存在すればそれを上書き
                if(!localStores.empty() && localStores.peek().containsKey(stat.getChild(0).getText())){
                    localStores.peek().put(stat.getChild(0).getText(), calcExpr(stat.getChild(1)));
                }else{
                    globalStore.put(stat.getChild(0).getText(), calcExpr(stat.getChild(1)));
                }
                break;
            case LogoParser.LOCAL:
                if(!localStores.empty()){
                    //ローカル変数を追加
                    localStores.peek().put(stat.getChild(0).getText(), 0.0);
                }
                break;
            case LogoParser.CLEAR:
                turtle.clear();
                break;
            case LogoParser.IF:
                if(calcBexpr(stat.getChild(0))){
                    execStats(stat.getChild(1));
                }
                break;
            case LogoParser.SHOW:
                turtle.show();
                break;
            case LogoParser.HIDE:
                turtle.hide();
                break;
            case LogoParser.SETPCRGB:
                double r = calcExpr(stat.getChild(0));
                double g = calcExpr(stat.getChild(1));
                double b = calcExpr(stat.getChild(2));
                turtle.setPenColor(r,g,b);
                break;
            case LogoParser.SETPENSIZE:
                turtle.setPenSize((int)calcExpr(stat.getChild(0)));
                break;
            case LogoParser.SETPOS:
                double x = calcExpr(stat.getChild(0));
                double y = calcExpr(stat.getChild(1));
                turtle.setPosition(x, y);
                break;
            case LogoParser.SETH:
                turtle.setH(calcExpr(stat.getChild(0)));
                break;
            case LogoParser.TO:
                procedures.put(stat.getChild(0).getText(), stat);
                break;
            case LogoParser.CALL:
                String varName = stat.getChild(0).getText();
                if(procedures.containsKey(varName)){
                    //引数をローカル変数に登録する
                    Tree callStats = procedures.get(varName);
                    Tree params = callStats.getChild(1);
                    Tree exprs = stat.getChild(1);
                    HashMap<String, Double> store = new HashMap<String, Double>();
                    for(int i = 0; i < params.getChildCount(); i++){
                        store.put(params.getChild(i).getText(), calcExpr(exprs.getChild(i)));
                    }
                    localStores.push(store);
                    //手続きの実行
                    execStats(callStats.getChild(2));
                    localStores.pop();
                    stopped = false;
                }
                break;
            case LogoParser.STOP:
                this.stopped = true;
                break;
        }
    }

    /**
     * 条件文の評価を行う
     * @param bexpr 条件文の構文木
     * @return 条件式の真偽
     */
    private boolean calcBexpr(Tree bexpr){
        double left = calcExpr(bexpr.getChild(0));
        double right = calcExpr(bexpr.getChild(1));

        switch(bexpr.getType()){
            case LogoParser.EQ:
                return left == right ? true : false;
            case LogoParser.NEQ:
                return left != right ? true : false;
            case LogoParser.LESS:
                return left < right ? true : false;
            case LogoParser.GREATER:
                return left > right ? true : false;
        }

        return false;
    }

    /**
     * 数式の演算を行う
     * @param expr 数式の構文木
     * @return 演算結果
     */
    private double calcExpr(Tree expr){
        Tree e0, e1;
        switch(expr.getType()) {
            case LogoParser.NUM:
                String s = expr.getText();
                return Double.parseDouble(s);
            case LogoParser.NEG:
                e0 = expr.getChild(0);
                return -calcExpr(e0);
            case LogoParser.PLUS:
                e0 = expr.getChild(0);
                e1 = expr.getChild(1);
                return calcExpr(e0) + calcExpr(e1);
            case LogoParser.MINUS:
                e0 = expr.getChild(0);
                e1 = expr.getChild(1);
                return calcExpr(e0) - calcExpr(e1);
            case LogoParser.MULT:
                e0 = expr.getChild(0);
                e1 = expr.getChild(1);
                return calcExpr(e0) * calcExpr(e1);
            case LogoParser.DIV:
                e0 = expr.getChild(0);
                e1 = expr.getChild(1);
                return calcExpr(e0) / calcExpr(e1);
            case LogoParser.REPCOUNT:
                return repCounts.peek();
            case LogoParser.VAR:
                if(!localStores.empty() && localStores.peek().containsKey(expr.getText())){
                    //もしローカル変数があればそれを返す
                    return localStores.peek().get(expr.getText());
                }
                if(globalStore.containsKey(expr.getText())){
                    return globalStore.get(expr.getText());
                }
        }
        return 0;   //Error
    }
}
