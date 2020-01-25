package internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        capacityVsSize();

//        throwException();

    }

    private static void capacityVsSize() {
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("Demo");
            getCapacity(list);
            list.add("1");
            getCapacity(list);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void getCapacity(ArrayList<?> l)
            throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        System.out.format("Size: %2d, Capacity: %2d%n", l.size(), ((Object[]) dataField.get(l)).length);
    }


    private static void throwException() {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Demo");
        list.add("1");
        list.add(6, "Test");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
