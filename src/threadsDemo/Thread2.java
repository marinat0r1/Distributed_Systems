package threadsDemo;

import java.util.Scanner;

public class Thread2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int i = 0;
        while(true) {
            line = scanner.nextLine();
            Thread1 thread1 = new Thread1(i);
            thread1.start();
            i++;
        }
    }
}
