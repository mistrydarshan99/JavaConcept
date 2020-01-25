package wildCard;

import java.util.Arrays;
import java.util.List;

public class AcceptAllArgument {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        acceptAllList(li);
        acceptAllList(ls);

        List<Object> listObject = Arrays.asList("one", "two", "three", new Laptop());
        acceptOnlyObject(listObject);
        List<Laptop> listLaptopObject = Arrays.asList(new Laptop());
//        acceptOnlyObject(listLaptopObject); // method accept only object
        acceptExtendObject(listLaptopObject);
    }

    private static void acceptAllList(List<?> list) {
//        list.add("Darshan"); // cannot add item
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    private static void acceptOnlyObject(List<Object> list) {
//        list.add("Darshan"); //not allow to add
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    private static void acceptExtendObject(List<? extends Object> list) {
//        list.add("Darshan"); //not allow to add
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }
}

class Laptop {

}
