import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookSearcherTest {

    private BookSearcher searcher;

    @BeforeEach
    void setUp() {
        BookStorage storage = new BookStorage();
        storage.addBook(new Book("자바 프로그래밍", "홍길동", "한빛", "1111", "기술과학"));
        storage.addBook(new Book("파이썬 기초", "김철수", "에이콘", "2222", "기술과학"));
        storage.addBook(new Book("세계 역사 이야기", "이순신", "민음사", "3333", "역사"));
        storage.addBook(new Book("철학의 즐거움", "칸트", "문학동네", "4444", "철학"));
        storage.addBook(new Book("예술의 이해", "정약용", "아트북스", "5555", "예술"));
        storage.addBook(new Book("자연 과학 개론", "장보고", "사이언스북", "6666", "자연과학"));

        searcher = new BookSearcher(storage);
    }

    @Test
    void searchByTitle() {
        List<Book> result = searcher.searchByTitle("자바");

        assertEquals(1, result.size());
        assertEquals("자바 프로그래밍", result.get(0).getTitle());
    }

    @Test
    void searchByPartial() {
        List<Book> result = searcher.searchByTitle("프로그래밍");

        assertEquals(1, result.size());
        assertTrue(result.get(0).getTitle().contains("프로그래밍"));
    }

    @Test
    void searchByCase() {
        List<Book> result = searcher.searchByTitle("pYtHoN");

        assertEquals(1, result.size());
        assertEquals("파이썬 기초", result.get(0).getTitle());
    }

    @Test
    void searchByNoMatch() {
        List<Book> result = searcher.searchByTitle("없는 제목");

        assertTrue(result.isEmpty());
    }

    @Test
    void testRecommend_Engineering() {
        List<Book> result = searcher.recommendByCollege("공과대학");

        assertEquals(2, result.size());
    }

    @Test
    void testRecommend_LibrarlArts() {
        List<Book> result = searcher.recommendByCollege("인문사회대학");

        assertEquals(1, result.size());
        assertEquals("철학", result.get(0).getCategory());
    }

    @Test
    void testRecommend_Arts() {
        List<Book> result = searcher.recommendByCollege("예술대학");

        assertEquals(1, result.size());
        assertEquals("예술", result.get(0).getCategory());
    }

    @Test
    void testRecommend_None() {
        List<Book> result = searcher.recommendByCollege("");

        assertTrue(result.isEmpty());
    }

}
