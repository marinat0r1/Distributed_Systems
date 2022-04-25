package publishing;

import displaying.Car;
import displaying.Display;
import displaying.DisplayReader;
import displaying.DisplayWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class main {


    public static void main(String[] args) {

        System.out.println("Testing exercise 1");

        ArrayList<Publication> publications = new ArrayList<>(
                Arrays.asList(
                        new Publication("ANicePublication" , "German", 49),
                        new Book("BigBook" , "Italian", 28, "Giovanni", "1234567890"),
                        new Publication("GreatPublication2" , "English", 55),
                        new Publication("ANicePublication2" , "German", 34),
                        new Book("GreatestBookEver" , "German", 129, "Hans", "0987654321"))
        );

        for (Publication publication : publications) {
            publication.print();
        }

        System.out.println("\n\nTesting Exercise 2");

        ArrayList<Display> displayArrayList = new ArrayList<>(
                Arrays.asList(
                        new Publication("ANicePublication" , "German", 49),
                        new Book("BigBook" , "Italian", 28, "Giovanni", "1234567890"),
                        new Publication("GreatPublication2" , "English", 55),
                        new Publication("ANicePublication2" , "German", 34),
                        new Book("GreatestBookEver" , "German", 129, "Hans", "0987654321"),
                        new Car("red", 240, 480),
                        new Car("blue", 100, 700),
                        new Car("black", 200, 600))
        );

        for (Display displays : displayArrayList) {
            displays.print();
        }

        DisplayWriter.writeDisplayObject(displayArrayList);

        ArrayList<Display> displayArrayList1 = DisplayReader.displayObjectReader();

        for (Display displays : displayArrayList1) {
            displays.print();
        }

    }
}
