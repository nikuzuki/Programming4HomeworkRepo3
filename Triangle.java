// 2. (1) クラスTriangle

class Triangle extends Figure{  // 三角形
  private double perimeter;  // 周囲長
  private double size;       // 面積

  Triangle(double a, double b, double c){ // 3辺の長さa, b, c
    super("Triangle");
    this.perimeter = bdLength(a, b, c);
    this.size = area(a, b, c);
  }

  double bdLength(double a, double b, double c){ // 周囲長
    return a + b + c;
  }

  double area(double a, double b, double c){     // 面積
    if(a > b){
      if(a > c){    // aが一番大きい = aが斜辺
        return b * c * 0.5;
      }
      else{         // cが一番大きい = cが斜辺
        return a * b * 0.5;
      }
    }
    else{
      if(b > c){     // bが一番大きい = bが斜辺
        return a * c * 0.5;
      }
      else{          // cが一番大きい = cが斜辺
        return a * b * 0.5;
      }
    }
  }

  void printInfo(){ // 図形情報 ID, 図形の種類, 周囲長, 面積を表示
    System.out.println("ID: " + this.id);
    System.out.println("種類: " + this.kind);
    System.out.println("周囲長: " + this.perimeter);
    System.out.println("面積: " + this.size);
    System.out.println("---------  ");
  }
}
