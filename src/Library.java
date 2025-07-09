import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        //show available options
        //show availabe books, borrow book, return book, exitpsvm
        Scanner scan= new Scanner(System.in);
        //todo create some books and users
       Book book1 = new Book(12, "Atomic Habits", 10, "Author");
       System.out.println(book1.getBookNo());
       System.out.println(book1.getBookName());
       System.out.println(book1.getBookQuantity());
       System.out.println(book1.getBookAuthor());

        Book book2 = new Book(10, "Muna Madan", 9, "Laxmi prasad devkota");
        System.out.println(book2.getBookNo());
        System.out.println(book2.getBookName());
        System.out.println(book2.getBookQuantity());
        System.out.println(book2.getBookAuthor());

        Book book3 = new Book(22, "Ek chiyan", 20, "Hridaya chandra singh");
        System.out.println(book3.getBookNo());
        System.out.println(book3.getBookName());
        System.out.println(book3.getBookQuantity());
        System.out.println(book3.getBookAuthor());

        Book book4 = new Book(30, "one piece", 10, "Author1");
        System.out.println(book4.getBookNo());
        System.out.println(book4.getBookName());
        System.out.println(book4.getBookQuantity());
        System.out.println(book4.getBookAuthor());

        User user1= new User("Sunil", "Sunil-57", 556664);
        System.out.println(user1.getName());
        System.out.println(user1.getUsername());
        System.out.println(user1.getContact());


        System.out.println("-----welcome to the library-----");
        System.out.println("Enter 1: Show available book");
        System.out.println("Enter 2: Borrow book");
        System.out.println("Enter 3: Return book");
        System.out.println("Enter 4: exit");
        System.out.println("Choose an options:");

        int option = scan.nextInt();
        if(option == 1) {
            System.out.println("Show available books");
        }
        else if(option == 2){
            System.out.println("Borrow book");
            //todo kun book borrow garney ho tyo chai dinu parxa
            //todo borrow garera sakesi message dekhauna parxa
            System.out.println("before:");
            user1.borrowBook(user1, book1);
        }
        else if(option == 3){
            System.out.println("return book");
        }
        else if(option == 4){
            System.out.println("Exit");
        }
        else{
            System.out.println("invalid options");
        }
        //todo need to figure out where to keep the books?

    }
}
