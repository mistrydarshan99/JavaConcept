package Inheritance;

public class MethodVariable {

    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        System.out.println(bottle.i);
        bottle.bottleMethod();

        Box box = new Box();
        System.out.println(box.i);
        box.bottleMethod();

        Bottle bottle1 = new Box();
        System.out.println(bottle1.i);
        bottle1.bottleMethod();
    }
}

class Bottle {
    int i = 10;

    void bottleMethod(){
        System.out.println("Bottle");
    }
}

class Box extends Bottle {
    int i = 20;

    @Override
    void bottleMethod() {
        System.out.println("Box Method");
    }
}

