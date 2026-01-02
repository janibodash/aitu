import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Library library = new Library("Sun Library", "8777", 0);
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            sc.nextLine();

            Book book = new Book(title, author, year);
            library.addBook(book);
        }

        System.out.println("\nAll books:");
        library.showAllBooks();

        System.out.print("\nEnter title to search: ");
        String searchTitle = sc.nextLine();
        library.findBook(searchTitle);

        System.out.println("\nSorted by year:");
        library.sortByYear();
        library.showAllBooks();

        Person p = new LibraryMember(1, "Jani", "8777", 0, 0);


    }
}
