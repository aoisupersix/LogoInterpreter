import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/*
 * LogoInterpreterのメインクラス
 */

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
		LogoLexer lexer = new LogoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LogoParser parser = new LogoParser(tokens);

		//計算式を入力して計算木を作る
		Tree tree = (Tree) parser.prog().getTree();

		//計算木を表示
		//printTree(tree);

        Interpreter interpreter = new Interpreter();
        interpreter.interp(tree);
	}

	//構文木(計算木)表示用のメソッド
	private static void printTree(Tree tree){
		printTreeHelper(tree, "", "");
	}

	private static void printTreeHelper(Tree tree, String indent, String indent2){
		System.out.println(indent + tree.getText());
		int sz = tree.getChildCount();
		for(int i = 0; i < sz; i++){
			if( i < (sz - 1)){
				printTreeHelper(tree.getChild(i), indent2 + " ├───", indent2 + " |  ");
			}else {
				printTreeHelper(tree.getChild(i), indent2 + " └───", indent2 + "    ");
			}
		}
	}
}
