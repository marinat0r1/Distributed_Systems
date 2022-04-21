package threadsDemo;

public class Thread1 extends Thread{
    private int number;

    public Thread1(int number) {
        this.number = number;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(number);
                sleep(3000);
            }
        } catch (Exception e) {

        }
    }

}
