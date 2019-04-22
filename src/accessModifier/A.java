package accessModifier;

public class A {
    protected int i;
}

class B extends A {
    private void print() {
        System.out.println(i);
    }
}

class C extends A {
    private void print() {
        A a = new A();
        System.out.println(a.i);
    }
}
