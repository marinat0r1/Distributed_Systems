import java.util.HashSet;
import java.util.Iterator;

public class Printing {

    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < args.length; i++) {
            stringHashSet.add(args[i]);
        }

        Iterator<String> iterator = stringHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
