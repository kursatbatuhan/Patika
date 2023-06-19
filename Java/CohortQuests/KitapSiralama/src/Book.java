import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String bookName, int pageCount, String authorName, String publicationDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.getBookName());
    }

    public static Comparator<Book> sortByPageCount() {
        return Comparator.comparingInt(Book::getPageCount);
    }
}