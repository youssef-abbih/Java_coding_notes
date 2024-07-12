import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();


    private Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) return book;
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) return member;
        }
        return null;
    }

    public void addBook(Book book){books.add(book);}
    public void addMember(Member member){members.add(member);}
    public void borrowBook(String ISBN, String memberId){
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if (member != null && book != null && !book.isBorrowed()) member.borrowBook(book);
        else System.out.println("Cannot borrow the book.");
    }
    public void returnBook(String ISBN, String memberId){
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if (member != null && book != null && book.isBorrowed()) member.returnBook(book);
        else System.out.println("Cannot return the book.");
    }

}
