import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    // 샘플 도서
    public void sampleBooks() {
        books.add(new Book("데이터 통신", "Forouzan", "한빛아카데미", "004.5", "기술과학"));
        books.add(new Book("컴퓨터 네트워크", "김봉한", "한빛미디어", "004.6", "기술과학"));
        books.add(new Book("운영체제", "Silberschatz", "McGrawHill", "005.4", "기술과학"));
        books.add(new Book("철학의 이해", "김임시", "임시출판사", "100", "철학"));
        books.add(new Book("경영학 원론", "이임시", "임시출판사", "325", "경영"));
        books.add(new Book("의학개론", "최임시", "임시출판사", "510", "의학"));
        books.add(new Book("AI 개론", "홍임시", "임시출판사", "006", "컴퓨터"));
    }
}
