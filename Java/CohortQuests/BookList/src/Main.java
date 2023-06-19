import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = createBookList();

        // Kitap isminin karşısında yazar ismi olan yeni bir Map oluşturma
        Map<String, String> bookAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        System.out.println("Kitaplar: " + bookAuthorMap);

        // Sayfa sayısı 100'den fazla olan kitapları filtreleme
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("Sayfa sayısı 100'den fazla olan kitaplar: ");
        for (Book book : filteredBooks) {
            System.out.println(book);
        }
    }

    private static List<Book> createBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Kitap 1", 150, "Yazar 1", LocalDate.of(2021, 1, 1)));
        books.add(new Book("Kitap 2", 200, "Yazar 2", LocalDate.of(2021, 2, 1)));
        books.add(new Book("Kitap 3", 80, "Yazar 3", LocalDate.of(2021, 3, 1)));
        books.add(new Book("Kitap 4", 120, "Yazar 4", LocalDate.of(2021, 4, 1)));
        books.add(new Book("Kitap 5", 250, "Yazar 5", LocalDate.of(2021, 5, 1)));
        books.add(new Book("Kitap 6", 90, "Yazar 6", LocalDate.of(2021, 6, 1)));
        books.add(new Book("Kitap 7", 180, "Yazar 7", LocalDate.of(2021, 7, 1)));
        books.add(new Book("Kitap 8", 110, "Yazar 8", LocalDate.of(2021, 8, 1)));
        books.add(new Book("Kitap 9", 300, "Yazar 9", LocalDate.of(2021, 9, 1)));
        books.add(new Book("Kitap 10", 70, "Yazar 10", LocalDate.of(2021, 10, 1)));
        return books;
    }
}

