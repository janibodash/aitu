public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("The Picture of Dorian Gray","Oscar Wilde", 1890);
        Book book2 = new Book("The Lord of the Rings","J.R.R. Tolkien",1955);
        Book book3 = new Book("The Master and Margarita","Mikhail Bulgakov",1967);

        book1.BookInfo();
        book2.BookInfo();
        book3.BookInfo();

        book1.setYear(1954);

        System.out.println("Do they have the same author? "+book1.getAuthor().equals(book2.getAuthor()) );
        System.out.println("Do they have the same author? "+book1.getAuthor().equals(book3.getAuthor()));

        LibraryMember memb1= new LibraryMember(1,"Jani","8 751 852 96 14",2,0);
        LibraryMember memb2= new LibraryMember(2,"Amanbek","8 714 520 96 20",2,0);



        System.out.println(memb1.getName()+ " borrowed " + memb1.getBorrowedb() + " books.");

        Library library1 = new Library("sun","8 741 852 10 01", 56204);
        Library library2 = new Library("moon","8 520 741 25 02",55020);

        library1.LibInf();
        library2.LibInf();

        System.out.println("do they have the same amount of books? " + (library1.getTotalBooks()==library2.getTotalBooks()));
        System.out.println("Comparing library size: " + library1.getTotalBooks() + " books");
    }
}
