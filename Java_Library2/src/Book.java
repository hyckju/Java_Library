public class Book {
    private final String title;
    private final String author;
    private final String publisher;
    private final String callNumber;
    private final String category;

    public Book(String title, String author, String publisher, String callNumber, String category) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.callNumber = callNumber;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getCategory() {
        return category;
    }
    public String getCallNumber() {
        return callNumber;
    }

    @Override
    public String toString() {
        return "[도서명] " + title + "| [저자] " + author +  "| [출판사] "  + publisher +
                "| [청구 기호] " +  callNumber;
    }


}
