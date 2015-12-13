// 2. Figureクラス

class Figure{
  static int id = 101;  // 図形のID
  String kind;          // 図形の種類

  Figure(String s){     // コンストラクタ
    id++;
    kind = s;
  }

  double bdLength(){
    return 0;
  }

  double area(){
    return 0;
  }

  void printInfo(){
    System.out.println("ID: " + id);
    System.out.println("種類 " + kind);
    System.out.println("---------  ");
  }

}
