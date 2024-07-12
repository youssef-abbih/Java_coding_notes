public class Book implements Borrowable{
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(){}
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getISBN(){return ISBN;}
    public boolean isBorrowed(){return isBorrowed;}
    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("The book is already borrowed.");
        }
    }
    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("The book is not borrowed.");
        }
    }
    public void borrowBook() {borrow();}
    public void returnBook() {returnItem();}
}
