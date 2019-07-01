package thread;

import java.util.LinkedList;

public class SynchornizationMistakes {
    private static int count = 0;
  
    //locking on this object lock
    public synchronized int getCount(){
        return count;
    }
  
    //locking on .class object lock
    public static synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        SynchornizationMistakes synchornizationMistakes = new SynchornizationMistakes();
        SynchornizationMistakes.increment();
        System.out.println(""+synchornizationMistakes.getCount());

        LinkedList<Integer> stackList = new LinkedList<>();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);
        stackList.pop();
        System.out.println(stackList);

        LinkedList<Integer> queueList = new LinkedList<>();
        queueList.offer(10);
        queueList.offer(20);
        queueList.offer(30);
        System.out.println(queueList);
        queueList.poll();
        System.out.println(queueList);
    }

}

