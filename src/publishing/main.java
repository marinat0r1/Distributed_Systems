package publishing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
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
    }
}
