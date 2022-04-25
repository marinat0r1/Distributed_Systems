package publishing;

import displaying.Display;

import java.io.Serializable;

public class Publication implements Display, Serializable {
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