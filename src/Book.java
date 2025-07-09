public class Book {
    //attributes-> book number, nam, quantity, author
    // create the attributes
    private int BookNo;
    private String BookName;
    private int BookQuantity;
    private String BookAuthor;
//    private int DecreaseQuantity;
    public Book(int BookNo, String BookName, int BookQuantity, String BookAuthor){
        this.BookNo = BookNo;
        this.BookAuthor = BookAuthor;
        this.BookName=BookName;
        this.BookQuantity=BookQuantity;
//        this.DecreaseQuantity=DecreaseQuantity;
    }
    //behaviour -> increase quantity, decrease quantity
    public void increaseQuantity(){
        System.out.println("need work to increase");
    }
    public void decreaseQuantity() {
        System.out.println("need work to decrease");
    }

    public void setBookNo(int bookNo) {
        this.BookNo = bookNo;
    }

    public int getBookNo() {
        return BookNo;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookQuantity(int bookQuantity) {
        this.BookQuantity = bookQuantity;
    }

    public int getBookQuantity() {
        return BookQuantity;
    }

    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }
}
