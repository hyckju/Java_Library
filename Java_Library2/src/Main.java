import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStorage storage = new BookStorage();
        storage.sampleBooks();
        BookSearcher searcher = new BookSearcher(storage);

        System.out.println("=== 도서 검색 프로그램 ===");
        while (true) {
            System.out.println("1. 도서 검색");
            System.out.println("2. 도서 저장");
            System.out.println("3. 학과별 추천 도서 확인");
            System.out.println("0. 종료");
            System.out.println("=======================");

            System.out.print("선택 ==> ");
            String choice = sc.nextLine();

            if (choice.equals("0")) {
                System.out.println("프로그램 졸료");
                break;

            } else if (choice.equals("1")) {
                System.out.print("도서명 입력: ");
                String title = sc.nextLine();

                System.out.print("저자 입력: ");
                String author = sc.nextLine();

                System.out.print("청구기호 입력: ");
                String callNumber = sc.nextLine();

                List<Book> results;
                results = searcher.searchBook(title, author, callNumber);

                System.out.println("\n----------------------------");
                if (results.isEmpty()) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    for (Book book : results) {
                        System.out.println("검색 결과 (" + results.size() + "건):");
                        System.out.println(book);
                    }
                }
                System.out.println("----------------------------");

            } else if (choice.equals("2")) {
                System.out.print("도서명 입력: ");
                String title = sc.nextLine();

                System.out.print("저자 입력: ");
                String author = sc.nextLine();

                System.out.print("청구기호 입력: ");
                String callNumber = sc.nextLine();

                System.out.print("카테고리: ");
                String category = sc.nextLine();

                Book book = new Book(title, author, callNumber, category);
                storage.addBook(book);
                System.out.println("도서 저장 완료");
                System.out.println("\n----------------------------");
            }
        }
        sc.close();
    }
}