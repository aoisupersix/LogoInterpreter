/**
* Logoにおける「亀」。
* 亀はキャンバス上に配置される
* 亀にはペンが設置されていて、ペンが下に降りた状態で移動すると、軌跡がキャンバス上に描画される。
* 逆にペンが上に上がった状態で移動すると亀は移動するが、軌跡が描画されることはない
*/

public class Turtle {
    public static final int SVG_WIDTH = 300;
    public static final int SVG_HEIGHT = 300;

    private double x, y; //亀の位置
    private double dir; //亀の向き(x軸プラス方向が0度、時計回りに角度が増加)
    private String svgData = ""; //亀の軌跡データ
    private String penColor = "#0000FF"; //軌跡の色
    private int penSize = 2; //ペンの太さ
    private boolean penIsDown; //亀のペンが降りているなら真、ペンが上がっているなら偽
    private boolean isShown = true; //亀を表示するかどうか

    //svgDataの前に追加する文
    private String beforeSvg =
    "<?xml version=\"1.0\"?>" + "\n"
    + "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"" + SVG_WIDTH + "\" height=\"" + SVG_HEIGHT + "\" version=\"1.1\">" + "\n"
    + "<path d=\"M 0 0 L 0 " + SVG_HEIGHT + " " + SVG_WIDTH + " " + SVG_HEIGHT + " " + SVG_WIDTH + " 0 z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"1\" />";
    //svgDataのあとに追加する文
    private String afterSvg = "</svg>";

    /**
    * 新しい「亀を作る」
    * @param x 配置する位置のx座標
    * @param y 配置する位置のy座標
    * @param dir 亀の向き　単位は度
    * @param pen trueならペンは下に降りている
    */
    public Turtle(double x, double y, double dir, boolean pen) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.penIsDown = pen;
    }

    /**
     * 亀を引数に指定された位置まで移動させる
     * @param x 移動させるx座標
     * @param y 移動させるy座標
     */
    public void setPosition(double x, double y) {
        //前処理
        this.svgData += "\n<path d=\"M " + this.x + " " + this.y;
        this.x = x;
        this.y = y;
        if(this.penIsDown){
            //描画
            this.svgData += " " + "L " + x + " " + y;
        }
        //後処理
        this.svgData += "\" fill=\"none\" stroke=\"" + this.penColor + "\" stroke-width=\"" + this.penSize + "\" />";
    }

    /**
     * 亀を引数に指定された向きに回転させる
     * @param d 亀を回転させる向き
     */
    public void setH(double d){
        this.dir = d;
    }

    /**
    * 亀を前進させる
    * @param dist 前進させる距離(単位はピクセル)
    */
    public void forward(double dist) {
        double rad = Math.PI * (this.dir / 180);
        setPosition(this.x + dist * Math.cos(rad), this.y + dist * Math.sin(rad));
    }

    /**
    * 亀をその場で回転させる
    * @param r 回転角 単位は度
    */
    public void turn(double r) {
        this.dir += r;
    }

    /**
    * ペンを上げる
    */
    public void penUp() {
        this.penIsDown = false;
    }

    /**
    * ペンを下に降ろす
    */
    public void penDown() {
        this.penIsDown = true;
    }

    /**
    * 画面を初期化する
    */
    public void clear() {
        this.svgData = "";
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.penIsDown = true;
    }

    /**
    * 亀を表示するよう指定する
    */
    public void show(){
        this.isShown = true;
    }

    /**
    * 亀を表示しないよう指定する
    */
    public void hide(){
        this.isShown = false;
    }

    /**
     * 描画する軌跡の色を変更する
     * @param r 赤成分0.0~1.0
     * @param g 緑成分0.0~1.0
     * @param b 青成分0.0~1.0
     */
    public void setPenColor(double r, double g, double b){
        this.penColor = "#" + String.format("%02X", (int)(r*255)) + String.format("%02X", (int)(g*255)) + String.format("%02X", (int)(b*255));
    }

    public void setPenSize(int size){
        this.penSize = size;
    }

    /**
    * 軌跡データを印字する
    */
    public void dumpSVG() {
        System.out.println(this.beforeSvg + svgData);
        if(this.isShown){
            //亀の描画 TODO:ゴリ押しなので暇があったら修正
            double rad = Math.PI * ((this.dir + 90) / 180);
            double teihen = 40;
            double shahen = teihen / Math.sqrt(2);
            double x = this.x + teihen / 2 * Math.cos(rad);
            double y = this.y + teihen / 2 * Math.sin(rad);
            System.out.print("<path d=\"M " + this.x + " " + this.y + " L " + x + " " + y);
            rad = Math.PI * ((this.dir - 45) / 180);
            x += shahen * Math.cos(rad);
            y += shahen * Math.sin(rad);
            System.out.print(" L " + x + " " + y);
            rad = Math.PI * ((this.dir - 135) / 180);
            x += shahen * Math.cos(rad);
            y += shahen * Math.sin(rad);
            System.out.print(" L " + x + " " + y);
            System.out.print(" L " + this.x + " " + this.y);

            System.out.println("\" fill=\"CCFFFF\" stroke=\"#228b22\" stroke-width=\"4\" />");
        }
        System.out.println(this.afterSvg);
    }
}
