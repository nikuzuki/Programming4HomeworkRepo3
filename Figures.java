// 2.(2)クラスFigures

class Figures{
  Figure[] figures;

  Figures(int n){ // n個の要素のFigure型の配列を作成してfiguresにセット
    figures = new Figure[n];
  }

  void setFigure(int i, Figure fp){ // figure[i]にfpをセット
    figures[i] = fp;
  }

  Figure getFigure(int i){          // figure[i]を返す
    return figures[i];
  }
}
