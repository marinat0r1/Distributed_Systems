package displaying;

import java.io.Serializable;

public class Car implements Display, Serializable {

    private String colour;
    private int horsepower;
    private int weight;

    public Car(String colour, int horsepower, int weight) {
        this.colour = colour;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    public void print() {
        System.out.println("\n" + colour + " / " + horsepower + " / " + weight);
    }

}
