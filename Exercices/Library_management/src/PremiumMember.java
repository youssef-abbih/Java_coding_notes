public class PremiumMember extends Member{
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBooks().size() < 10) {
            super.borrowBook(book);
        } else {
            System.out.println("Premium members can only borrow up to 10 books.");
        }
    }

    @Override
    public void returnBook(Book book) {
        super.returnBook(book);
    }
}
