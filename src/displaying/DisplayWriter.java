package displaying;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DisplayWriter {

    public static void writeDisplayObject(ArrayList<Display> objects) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("display_obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objects);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
