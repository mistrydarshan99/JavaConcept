package accessModifier;

public class A {
    protected int i;
    int defaultValue;

    private void privateMethod(){

    }

    protected void protectedMethod(){

    }

    public void publicMethod(){

    }

    void defaultMethod(){

    }
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
