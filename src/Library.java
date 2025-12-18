public class Library {
    private String libraryName;
    private String phone;
    private int totalBooks;

    public Library(String libraryName, String phone,int totalBooks){
        this.libraryName=libraryName;
        this.phone=phone;
        this.totalBooks=totalBooks;
    }

    public String getLibraryName(){
        return libraryName;
    }
    public String getPhone(){
        return phone;
    }
    public int getTotalBooks(){
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
}
