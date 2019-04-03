package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadInterference_3_1 {


    public static void main(String[] args) {

        Counter c = new Counter();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(new MyRunnable(c));
            t.start();
        }
    }
}

class MyRunnable implements Runnable {
    Counter counter;

    public MyRunnable(Counter c) {
        counter = c;
    }

    public void run() {
        counter.increment();
        System.out.println("Counter value after increment:" + counter.value() + " from thread:" + Thread.currentThread().getName());
        counter.decrement();
        System.out.println("Counter value after decrement:" + counter.value() + " from thread:" + Thread.currentThread().getName());
    }
}

class Counter {
    private int c = 0;
//    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c++;
//        c.incrementAndGet();
    }

    public void decrement() {
        c--;
//        c.decrementAndGet();
    }

    public int value() {
        return c;
    }

}
