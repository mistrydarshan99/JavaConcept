package thread;

public class CreateThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.sleep(1000); // main thread gonna to be sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        Thread main = Thread.currentThread();
        main.setPriority(2);
        System.out.println("Name " + main.getName() + " Id " + main.getId() + " Priority " + main.getPriority());    //Output : main

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();    //instantiating your thread class that implements Runnable interface
        Thread t = new Thread(myThreadRunnable);       //Creating an object to Thread class by passing your thread as an argument
        t.setPriority(10);
        System.out.println("Thread 0 Name " + t.getName() + " Id " + t.getId());
        t.start();                            //Starting the thread

        Thread t2 = new Thread(myThreadRunnable);       //Creating an object to Thread class by passing your thread as an argument
        t2.setPriority(7);
        t2.setName("My Thread 2");
        System.out.println("Thread 2 Name " + t2.getName() + " Thread 2 ID " + t2.getId());
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        /*try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
        }
    }
}

class MyThreadRunnable implements Runnable {
    int i;

    @Override
    public void run() {

        i++;
        System.out.println(" i value is " + i);
    }
}
