import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("Book 1", 200, "Author 1", "2021-01-01");
        Book book2 = new Book("Book 2", 150, "Author 2", "2021-02-01");
        Book book3 = new Book("Book 3", 300, "Author 3", "2021-03-01");
        Book book4 = new Book("Book 4", 250, "Author 4", "2021-04-01");
        Book book5 = new Book("Book 5", 180, "Author 5", "2021-05-01");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println("Kitaplar isme göre sıralanmış hali:");
        for (Book book : bookSet) {
            System.out.println(book.getBookName());
        }

        Set<Book> sortedBookSet = new TreeSet<>(Book.sortByPageCount());

        sortedBookSet.add(book1);
        sortedBookSet.add(book2);
        sortedBookSet.add(book3);
        sortedBookSet.add(book4);
        sortedBookSet.add(book5);

        System.out.println("\nKitaplar sayfa sayısına göre sıralanmış hali:");
        for (Book book : sortedBookSet) {
            System.out.println(book.getBookName() + " - Sayfa Sayısı: " + book.getPageCount());
        }
    }
}