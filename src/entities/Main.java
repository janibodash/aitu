package entities;

import entities.Book;
import entities.Library;
import BookService.BookService;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /* Library library = new Library("Sun entities.Library", "8777", 0);
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<2;i++){
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

        Person p = new LibraryMember(1, "Jani", "8777", 0, 0);*/


                Scanner sc = new Scanner(System.in);
                Library library = new Library("Central Library",
                        "87771234567",
                        0);
                BookService service = new BookService();

                while (true) {
                    System.out.println("""
                    
                    ===== LIBRARY MENU =====
                    1. Show all books
                    2. Find book by title
                    3. Add new book
                    4. Delete book
                    5. Update book year
                    6. Update book author
                    0. Exit
                    ========================
                    """);

                    System.out.print("Choose option: ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // очистка Enter

                    switch (choice) {

                        case 1 -> {

                            service.ShowBooks(library);
                        }

                        case 2 -> {

                            System.out.print("Enter title: ");
                            String title = sc.nextLine();
                            service.findBook(library, title);
                        }

                        case 3 -> {

                            System.out.print("Title: ");
                            String title = sc.nextLine();

                            System.out.print("Author: ");
                            String author = sc.nextLine();

                            System.out.print("Year: ");
                            int year = sc.nextInt();
                            sc.nextLine();

                            Book book = new Book(title, author, year);
                            service.addBook(book);

                            System.out.println("Book added.");
                        }

                        case 4 -> {

                            System.out.print("Enter title to delete: ");
                            String title = sc.nextLine();
                            service.deleteBook(title);

                            System.out.println("Book deleted.");
                        }

                        case 5 -> {

                            System.out.print("Enter title: ");
                            String title = sc.nextLine();

                            System.out.print("Enter new year: ");
                            int newYear = sc.nextInt();
                            sc.nextLine();

                            service.updateYearBook(title, newYear);

                            System.out.println("Year updated.");
                        }

                        case 6 -> {

                            System.out.print("Enter title: ");
                            String title = sc.nextLine();

                            System.out.print("Enter new author: ");
                            String newAuthor = sc.nextLine();

                            service.updateAuthorBook(title, newAuthor);

                            System.out.println("Author updated.");
                        }

                        case 0 -> {
                            System.out.println("Bye!");
                            return;
                        }

                        default -> System.out.println("Wrong option.");
                    }
                }
            }
        }

