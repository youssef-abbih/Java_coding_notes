public class RegularMember extends Member{
    public RegularMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBooks().size() < 5) {
            super.borrowBook(book);
        } else {
            System.out.println("Regular members can only borrow up to 5 books.");
        }
    }

    @Override
    public void returnBook(Book book) {
        super.returnBook(book);
    }
}
