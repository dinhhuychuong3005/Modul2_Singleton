public class BookSingleton {
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private final String author;
    private final String title;

    public BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
