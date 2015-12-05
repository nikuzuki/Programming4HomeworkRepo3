// 1.(2) コマンドライン引数の末尾2つがサブクラス用
// このテストコードでは、BookPrice.javaの動作確認を行う

class BookTest{
  public static void main(String[] args){
    String title = args[0];       // 0番目の引数(title)
    int authorsNum = args.length; // 配列の要素

    String[] authors = new String[authorsNum];  // 著者名を入れる配列
    System.arraycopy(args, 1, authors, 0, authorsNum - 2);  // 著者名を格納
    String price = args[authorsNum - 1];

    BookPrice book = new BookPrice(title, authors, Integer.parseInt(price)); // オブジェクト生成

    System.out.println("TITLE  : " + book.getTitle());  // タイトルを出力

    String[] outputString = book.getAuthors();          // オブジェクトから著者を貰う

    for(int i = 0; i < (authorsNum - 2); i++){
      System.out.println("AUTHORS: " + outputString[i]);
    }

    System.out.println("PRICE:   " + book.getPrice());  // オブジェクトから値段を貰う
  }
}
