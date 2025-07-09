public class User {
    //attributes -> name, username, contact
    private String Name;
    private String username;
    private int contact;

    public User(String name, String username, int contact) {
        this.Name = name;
        this.username = username;
        this.contact = contact;
    }

    //behaviour -> check is return
//    todo registration
    public void isRegistered(){
        System.out.println("need to work on checking register");
    }
    // todo  borrow of book
    public void borrowBook(User user, Book book){
        if( book.getBookQuantity()>0){
        BookRecord record = new BookRecord(user,book);
        }else{
            System.out.println("Book not available");
        }
        System.out.println("need to work on borrow book");
    }
    //todo return of book
    public void returnBook(){
        System.out.println("need to work on return book");

    }
    public void setName(String name){
        this.Name=name;
    }

    public String getName() {
        return Name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getContact() {
        return contact;
    }
}
