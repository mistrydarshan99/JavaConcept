package thread;

public class ThreadInterference {

    public static void main(String[] args) {
        final Shared s1 = new Shared();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                s1.SharedMethod();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                s1.SharedMethod();
            }
        };

        t1.start();

        t2.start();
    }
}


class Shared {
    int i;

    void SharedMethod() {
        i = 10;
        System.out.println(i+ " "+ Thread.currentThread().getName());
        i = 20;
        System.out.println(i+ " "+ Thread.currentThread().getName());
        i = 30;
        System.out.println(i+ " "+ Thread.currentThread().getName());
    }
}
