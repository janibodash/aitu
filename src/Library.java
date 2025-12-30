import java.util.ArrayList;
public class Library {
    private String libraryName;
    private String phone;
    private int totalBooks;
    //2
    private ArrayList<Book> books;

    public Library(String libraryName, String phone, int totalBooks) {
        this.libraryName = libraryName;
        this.phone = phone;
        this.totalBooks = totalBooks;
        this.books = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getPhone() {
        return phone;
    }

    public int getTotalBooks() {
        return totalBooks;
    }
    public void setLibraryName(String libraryName){
        this.libraryName=libraryName;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public void LibInf(){
        System.out.println("Library name: "+ libraryName + " have "+totalBooks+ " books. "+ "their phone: "+phone);
    }
    //2
    //Добавление книги
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added");
    }
    //Показ всех книг
    public void showAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
    //Поиск книги
    public void findBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found");
    }



}
