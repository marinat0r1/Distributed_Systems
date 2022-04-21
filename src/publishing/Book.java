package publishing;

public class Book extends Publication {

    private String author;
    private String ISBN;

    public Book(String title, String language, int price, String author, String ISBN) {
        super(title, language, price);
        this.author = author;
        this.ISBN = ISBN;
    }

    public void print() {
        super.print();
        System.out.print(" / " + this.author + " / " + this.ISBN);
    }
}
