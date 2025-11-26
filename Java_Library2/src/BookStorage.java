import java.util.ArrayList;
import java.util.List;

public class BookStorage {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {//도서 저장 기능
        if (book != null) {//book에 입력 받은 값이 null이 아니면 추가
            books.add(book);
        }
    }
    public List<Book> getBooks() {
        return books;
    }

    public void sampleBooks() {//샘플 도서
        books.add(new Book("데이터 통신", "Forouzan, Behrouz A., 이재광, 김봉한", "digital","004.5 F727d3Kㅇ","기술 과학"));
        //books.add(new Book("(Wireshark로 배우는) 컴퓨터 네트워크 : Wireshark 4.x","김봉한, 이재광","004.5 김753ㅋ4","기술 과학"));
        //books.add(new Book("컴퓨터 구조와 원리 3.0 : 다양한 그림으로 배우는 컴퓨터의 동작 원리","신종홍","004.22 신922ㅋ","기술 과학"));

    }

}
