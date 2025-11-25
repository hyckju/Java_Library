import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookStorage storage = new BookStorage();
        storage.sampleBooks();

        BookAdder adder = new BookAdder(storage);
        adder.addBookFromConsole();



    }
}