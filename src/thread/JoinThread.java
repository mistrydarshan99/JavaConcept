package thread;

import java.util.ArrayList;
import java.util.List;

public class JoinThread {

    public static void main(String[] args) {

        System.out.println("main thread started : Task is to print numbers from 0 to 3000");

        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            final Thread t1 = new Thread() {
                @Override
                public void run() {
                    //Thread t1 started : Task is to print numbers from 0 to 1000"
                    if (j == 0) {
                        for (int i = 0; i <= 500000; i++) {
                            System.out.println(i);
                        }
                        System.out.println("Numbers from 0 to 5 are printed");
                    }

                    if (j == 1) {
                        for (int i = 5; i <= 10; i++) {
                            System.out.println(i);
                        }
                        System.out.println("Numbers from 0 to 5 are printed");
                    }

                    if (j == 2) {
                        for (int i = 10; i <= 15; i++) {
                            System.out.println(i);
                        }
                        System.out.println("Numbers from 0 to 5 are printed");
                    }

                    if (j == 3) {
                        for (int i = 15; i <= 20; i++) {
                            System.out.println(i);
                        }
                        System.out.println("Numbers from 0 to 5 are printed");
                    }

                    if (j == 4) {
                        for (int i = 20; i <= 25; i++) {
                            System.out.println(i);
                        }
                        System.out.println("Numbers from 0 to 5 are printed");
                    }

                }
            };
            threadList.add(t1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("-----------------------------"+i);
            Thread thread = threadList.get(i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        /*final Thread t1 = new Thread() {
            @Override
            public void run() {
                //Thread t1 started : Task is to print numbers from 0 to 1000"

                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 0 to 1000 are printed");
            }
        };

        final Thread t2 = new Thread() {
            @Override
            public void run() {
                //Thread t2 started : Task is to print numbers from 1001 to 2000

                try {
                    t1.join(5000, 500000);   //waits at most 5.5 seconds for thread t1 to finish it's task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 1001; i <= 2000; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 1001 to 2000 are printed");
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                //Thread t3 started : Task is to print numbers from 2001 to 3000

                try {
                    t2.join(5000);   //waits at most 5 seconds for thread t2 to finish it's task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 2001; i <= 3000; i++) {
                    System.out.println(i);
                }

                System.out.println("Numbers from 2001 to 3000 are printed");
            }
        };

        t3.start();

        t2.start();

        t1.start();

        try {
            t3.join();     //Waits for t3 thread to finish it's task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //No need enclose this join statement in try-catch blocks as we have already specified the exception with throws clause.

        System.out.println("Task is finished");*/
    }
}
