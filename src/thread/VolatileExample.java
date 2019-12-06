package thread;

class ExampleThread extends Thread {
    private volatile int testValue;
    private volatile VolatileExample v;

    public ExampleThread(String str, VolatileExample v) {
        super(str);
        this.v = v;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(getName() + " : " + i);
                if (getName().equals("Thread 1")) {
                    testValue = 10;
                    v.setTotal();
                    System.out.println("Thread 1 total "+v.getTotal());
                }
//                System.out.println(Thread.currentThread() + "Test value is " + testValue);
                if (getName().equals("Thread 2")) {
//                    System.out.println("Test Value : " + testValue);
                    System.out.println("Thread 2 total "+v.getTotal());
                }
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}

public class VolatileExample {
    private int total;
    public static void main(String args[]) {
        VolatileExample v = new VolatileExample();
        new ExampleThread("Thread 1", v).start();
        new ExampleThread("Thread 2", v).start();
    }

    public void setTotal(){
        total = 10;
    }

    public int getTotal(){
        return total;
    }
}