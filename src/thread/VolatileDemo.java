package thread;

public class VolatileDemo {

    public static boolean flag = true;

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Thread 1");
            if (flag) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
                flag = false;
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2");
            if (flag) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }).start();

    }

}


