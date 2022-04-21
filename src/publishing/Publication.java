package publishing;

public class Publication {
    private String title;
    private String language;
    private int price;
    public Publication (String title, String language, int price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }
    public void print() {
        System.out.print("\n" + this.title + " / " + this.language + " / " + this.price);
    }
}