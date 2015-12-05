// 1.(1) BookTest

class BookTest{
  public static void main(String[] args){
    String title = args[0];       // 0番目の引数(title)
    int authorsNum = args.length; // 配列の要素

    String[] authors = new String[authorsNum];  // 著者名を入れる配列
    System.arraycopy(args, 1, authors, 0, authorsNum - 1);  // 著者名を格納
    Book book = new Book(title, authors); // オブジェクト生成

    System.out.println("TITLE  : " + book.getTitle());  // タイトルを出力
    String[] outputString = book.getAuthors();  // オブジェクトから著者をget

    for(int i = 0; i < (authorsNum - 1); i++){
      System.out.println("AUTHORS: " + outputString[i]);
    }
    
  }
}
