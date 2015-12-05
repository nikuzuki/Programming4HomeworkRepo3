// 1.(1)Bookクラス

class Book{
  private String title;       // 本のタイトル
  private String[] authors;   // 本の著者(複数人可)

  Book(String title, String[] authors){ // コンストラクタ
    setTitle(title);
    setAuthors(authors);
  }

  String getTitle(){                    // 書名を返す
    return title;
  }

  String[] getAuthors(){                // 著者名を返す
    return authors;
  }

  void setTitle(String title){           // 書名をセット
    this.title = title;
  }

  void setAuthors(String[] authors){     // 著者名をセット
    this.authors = authors.clone();
  }
}
