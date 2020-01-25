package Inheritance;

public class InheritanceThirdOne {

    public static void main(String[] args) {
        A a = new A();

        B b = new B(a);

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);

        b.a.i = 20;
        b.i = 15;

        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);
    }
}

class A {
    int i = 10;
}

class B extends A {
    A a;

    public B(A a) {
        this.a = a;
    }
}
