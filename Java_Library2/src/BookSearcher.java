import java.util.ArrayList;
import java.util.List;

public class BookSearcher {
    private final BookStorage Storage;

    public BookSearcher(BookStorage Storage) {
        this.Storage = Storage;
    }

    public List<Book> searchBook(String title, String author,
                                 String callNumber, String category) {
        List<Book> result = new ArrayList<>();

        for (Book book : Storage.getBooks()) {//BookStorage에서 책들의 리스트를 반환
            if (title != null && title.isBlank()) {//제목 비교
                if (book.getTitle() == null ||
                        !book.getTitle().toLowerCase().contains(title.toLowerCase())) {//사용자에게 받은 문자열을 모두 소문자로 변환
                    continue;//조건 불일치 시 다음 조건으로 이동
                }
            }
            if (author != null && !author.isBlank()) {//저자 비교
                if (book.getAuthor() == null ||
                        !book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                    continue;
                }
            }
            if (callNumber != null && !callNumber.isBlank()) {//청구 기호 비교
                if (book.getCallNumber() == null ||
                        !book.getCallNumber().toLowerCase().contains(callNumber.toLowerCase())) {
                    continue;
                }
            }
            result.add(book);//모든 조건 통과 시 결과 리스트에 추가
        }
        return result;
    }
}
