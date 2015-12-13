// 2. (1) クラスCircle

class Circle extends Figure{
  private int idF;            // Figure一つ一つのID
  private double perimeter;  // 周囲長
  private double size;       // 面積

  Circle(double r){
    super("Circle");             // 種類をCircleに設定
    this.idF = this.id;
    this.perimeter = bdLength(r);
    this.size = area(r);
  }

  double bdLength(double r){ // 周囲長
    return 2 * Math.PI * r;  // 2πr
  }

  double area(double r){     // 面積
    return r * r * Math.PI;  // r^2*π
  }

  void printInfo(){ // 図形情報 ID, 図形の種類, 周囲長, 面積を表示
    System.out.println("ID: " + this.idF);
    System.out.println("種類: " + this.kind);
    System.out.println("周囲長: " + this.perimeter);
    System.out.println("面積: " + this.size);
    System.out.println("---------  ");
  }
}
