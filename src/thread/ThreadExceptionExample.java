package thread;

public class ThreadExceptionExample {

    public static void main(String[] args) throws InterruptedException {

       new Thread(() -> {

               System.out.println(100/0);

       }).start();

       Thread.sleep(5000);

        System.out.println("Exception example");
    }
}
