package interfaces;

public class AbstractClassExample extends Gift {

    public static void main(String[] args) {

        Person person = new Person();
        person.print();

        Gift gift = new Person();
        gift.print();
    }

    @Override
    void present() {

    }
}

abstract class Gift {
    abstract void present();

    void print() {
        System.out.println("Gift Print");
    }
}


abstract class Guest {
    abstract void present();
}

class Person extends Gift {

    @Override
    void present() {
        System.out.println("Person Present");
    }

    @Override
    void print() {
        System.out.println("Person Print");
    }
}

