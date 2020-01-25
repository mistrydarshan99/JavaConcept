package wildCard;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {
        //Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        //printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));
        sumOne(list1);

        //Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        //printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list2));
//        sumOne(list2); //Double is not super class of Integer

        //Number list
        List<Number> list3 = Arrays.asList(4.1, 5.1, 6.1);

        //printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list3));
        sumOne(list3);

        doSomethingWith(list1);
        doSomethingWith(list2);
        doSomethingWith(list3);

        doSomethingWithOne(list1);
//        doSomethingWithOne(list2); //Won't compile
        doSomethingWithOne(list3);
//        doSomethingWithOne(Arrays.asList(11.1f)); //It will give Runtime Exception
    }

    //    Upper Bounded Wildcards
    private static double sum(List<? extends Number> list) {

        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    //    Lower Bounded Wildcards
    private static void sumOne(List<? super Integer> list) {

        System.out.println(list);
    }

    //    Unbounded Wildcard:
    private static void printlist(List<?> list) {

        System.out.println(list);
    }

    //    treat it like that for reading purposes.
    public static void doSomethingWith(List<? extends Number> numbers) {
//        numbers.add(Integer.valueOf(0)); // Won't compile
//        numbers.add(10); //Won't compile

        for (Number number : numbers) {
            // Do something with number
        }
        // OR
        Number number = numbers.get(0);
        // OR
//        Number number1 = numbers.remove(0);
    }

    public static void doSomethingWithOne(List<? super Integer> integers) {
//        integers.add(Integer.valueOf(0));
//        integers.add(15);

        //Won't compile
//        for (Number number : integers) {
//            // Do something with number
//        }

        for (Object integer : integers) {
            System.out.println(((Integer)integer));
        }
    }
}
