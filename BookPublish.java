// 1.(2) BookPrice

class BookPublish extends Book{
  private String publisher;
  private int year;

  BookPublish(String title, String[] authors , String publisher, int year){
    super(title, authors);
    setPublisher(publisher);
    setYear(year);
  }

  void setPublisher(String publisher){  // 出版社名をセット
    this.publisher = publisher;
  }

  String getPublisher(){                // 出版社名を返す
    return this.publisher;
  }

  void setYear(int year){               // 発行年をセット
    this.year = year;
  }

  int getyear(){                        // 発行年を返す
    return this.year;
  }

}
