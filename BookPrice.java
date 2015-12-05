// 1.(2) BookPrice

class BookPrice extends Book{
  private int price;

  BookPrice(String title, String[] authors , int price){
    super(title, authors);
    setPrice(price);
  }

  void setPrice(int price){ // 値段をセット
    this.price = price;
  }

  int getPrice(){           // 値段を返す
    return this.price;
  }

}
