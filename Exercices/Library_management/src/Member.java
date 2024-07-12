import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }
    public String getMemberId(){
        return memberId;
    }
    public List<Book> getBorrowedBooks(){return borrowedBooks;}

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        book.borrowBook();
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.returnBook();
    }

}
