// 2. (1) クラスRectangle

class Rectangle extends Figure{
  private double perimeter;  // 周囲長
  private double size;       // 面積

  Rectangle(double a, double b){
    super("Rectangle");
    this.perimeter = bdLength(a, b);
    this.size = area(a, b);
  }

  double bdLength(double a, double b){ // 周囲長
    return 2 * a + 2 * b;
  }

  double area(double a, double b){     // 面積
    return a * b;
  }

  void printInfo(){ // 図形情報 ID, 図形の種類, 周囲長, 面積を表示
    System.out.println("ID: " + this.id);
    System.out.println("種類: " + this.kind);
    System.out.println("周囲長: " + this.perimeter);
    System.out.println("面積: " + this.size);
    System.out.println("---------  ");
  }
}
