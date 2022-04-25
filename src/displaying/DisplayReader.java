package displaying;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DisplayReader {

    public static ArrayList<Display> displayObjectReader() {
        try {
            FileInputStream fileInputStream = new FileInputStream("display_obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Display>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
