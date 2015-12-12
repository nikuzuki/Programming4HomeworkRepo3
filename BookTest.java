// 1.(2) コマンドライン引数の末尾2つがサブクラス用
// このテストコードでは、BookPublish.javaの動作確認を行う

// TODO: BookPublish用のテストコードに変更

class BookTest{
  public static void main(String[] args){
    String title = args[0];       // 0番目の引数(title)
    int authorsNum = args.length; // 配列の要素

    String[] authors = new String[authorsNum];  // 著者名を入れる配列
    System.arraycopy(args, 1, authors, 0, authorsNum - 3);  // 著者名を格納
    String publisher = args[authorsNum - 2];  // 末尾一個前に出版社名
    String year = args[authorsNum - 1];       // 末尾の発行年

    BookPublish book = new BookPublish(title, authors, publisher, Integer.parseInt(year)); // オブジェクト生成

    System.out.println("TITLE    : " + book.getTitle());  // タイトルを出力

    String[] outputString = book.getAuthors();          // オブジェクトから著者を貰う

    for(int i = 0; i < (authorsNum - 3); i++){
      System.out.println("AUTHORS  : " + outputString[i]);
    }

    System.out.println("publisher: " + book.getPublisher());  // オブジェクトから値段を貰う
    System.out.println("YEAR     : " + book.getYear());
  }
}
