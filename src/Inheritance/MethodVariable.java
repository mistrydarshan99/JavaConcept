package Inheritance;

public class MethodVariable {

    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        System.out.println(bottle.i);
        bottle.bottleMethod();
        Bottle.bottleMethodStatic();

        Box box = new Box();
        System.out.println(box.i);
        box.bottleMethod();
        Box.boxMethodStatic();

        Bottle bottle1 = new Box();
        System.out.println(bottle1.i);
        bottle1.bottleMethod();

        /*

          Super class object cannot assign into subclass variable.

         */
//        Box boxSuper = new Bottle();
    }
}

class Bottle {
    int i = 10;

    void bottleMethod() {
        System.out.println("Bottle Method");
    }

    static void bottleMethodStatic() {
        System.out.println("Bottle static method");
    }
}

class Box extends Bottle {
    int i = 20;

    @Override
    void bottleMethod() {
        System.out.println("Box Method");
    }

    static void boxMethodStatic() {
        System.out.println("Box static method");
    }
}

