import java.util.Scanner;

public class BookAdder {

    private final BookStorage storage;

    public BookAdder(BookStorage storage) {
        this.storage = storage;
    }

    // 콘솔 입력으로 신규 도서 추가
    public void addBookFromConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 신규 도서 등록 ===");

        System.out.print("도서 제목: ");
        String title = sc.nextLine();

        System.out.print("저자: ");
        String author = sc.nextLine();

        System.out.print("출판사: ");
        String publisher = sc.nextLine();

        System.out.print("청구기호: ");
        String callNumber = sc.nextLine();

        System.out.print("isbn: ");
        String isbn = sc.nextLine();

        System.out.print("카테고리: ");
        String category = sc.nextLine();

        // 입력값 검증 및 저장
        if (title.isBlank() || author.isBlank() || callNumber.isBlank() || isbn.isBlank() || category.isBlank()) {
            System.out.println("[오류] 모든 항목은 반드시 입력해야 합니다.");
            return;
        }

        Book newBook = new Book(title, author, publisher, callNumber, isbn, category);
        storage.addBook(newBook);

        System.out.println("✔ 신규 도서 등록 완료!");
        System.out.println(newBook);
    }
}

