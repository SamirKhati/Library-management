public class BookRecord {
    private User user;
    private Book book;
    private String date;
    private boolean isReturned;

    public BookRecord(User user, Book book) {
        this.user = user;
        this.book = book;
        this.date = "date";//todo jati bela add gareko ho record tyo date hunu parxa
        this.isReturned = false;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getDate() {
        return date;
    }

    public boolean isReturned() {
        return isReturned;
    }
}
