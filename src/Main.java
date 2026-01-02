import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        //2
        Library library = new Library("Sun Library", "8777", 0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();

        Book book = new Book(title, author, year);
        library.addBook(book);
        library.showAllBooks();
        library.findBook("The Lord of the Rings");
        library.sortByYear();

        Person p = new LibraryMember(1, "Jani", "8777", 0, 0);


    }
}
