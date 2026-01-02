public class Book {
    private String title;
    private String author;
    private int year;



    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void BookInfo() {
        System.out.println("books title:" + title + " by " + author + " in the " + year + " year.");
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //2
    public String toString(){
        return title + " by " + author + " ("+ year +")";
    }

    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode() + year;
    }
}