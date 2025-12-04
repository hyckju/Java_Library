import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.Test
    void testBookGetters() {

        String title = "자바의 정석";
        String author = "남궁성";
        String publisher = "도우출판";
        String isbn = "9788994492032";
        String category = "프로그래밍";


        Book book = new Book(title, author, publisher, isbn, category);


        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(publisher, book.getPublisher());
        assertEquals(isbn, book.getIsbn());
        assertEquals(category, book.getCategory());
    }

    @Test
    void BookInfo() {
         Book book = new Book(
            "자바 알고리즘",
            "김철수",
            "한빛미디어",
            "1234567890",
            "컴퓨터공학"
        );


        String output = book.toString();


        assertTrue(output.contains("자바 알고리즘"));
        assertTrue(output.contains("김철수"));
        assertTrue(output.contains("한빛미디어"));
        assertTrue(output.contains("1234567890"));
        assertTrue(output.contains("컴퓨터공학"));

        assertTrue(output.contains("[도서 정보]"));
        assertTrue(output.contains("도서명"));
    }
}