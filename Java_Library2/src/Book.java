public class Book {
    private final String title;
    private final String author;
    private final String callNumber;
    private final String category;

    public Book(String title, String author, String callNumber, String category) {
        this.title = title;
        this.author = author;
        this.callNumber = callNumber;
        this.category = category;
    }


    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getCallNumber() {return callNumber;}
    public String getCategory() {return category;}

    @Override
    public String toString() {
        return "[도서명] " + title + " | [저자] " + author + "| [청구 기호] "
                +  callNumber + "| [카테고리]" + category;
    }
}
