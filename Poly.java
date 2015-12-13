// 2.(3) クラスPoly
// コマンドライン引数の数を図形の数とする

public class Poly{
  public static void main(String[] args){
    int figuresNum = 10;   // 10個作成
    Figures figures = new Figures(figuresNum);

    Circle c1 = new Circle(1);
    Circle c2 = new Circle(2.5);
    Circle c3 = new Circle(10.25);
    Rectangle r1 = new Rectangle(1, 2);
    Rectangle r2 = new Rectangle(2.5, 5.5);
    Rectangle r3 = new Rectangle(12.34, 56.78);
    Rectangle r4 = new Rectangle(0.99999, 0.99999);
    Triangle t1 = new Triangle(1, 2, 5);
    Triangle t2 = new Triangle(1 , 1 , 1.41);
    Triangle t3 = new Triangle(2.5, 3.5, 4.301);

    // 10個セットする
    figures.setFigure(0, c1);
    figures.setFigure(1, c2);
    figures.setFigure(2, c3);
    figures.setFigure(3, r1);
    figures.setFigure(4, r2);
    figures.setFigure(5, r3);
    figures.setFigure(6, r4);
    figures.setFigure(7, t1);
    figures.setFigure(8, t2);
    figures.setFigure(9, t3);

    for(int i = 0; i < figuresNum; i++){
      figures.getFigure(i).printInfo();
    }

  }
}
