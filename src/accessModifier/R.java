package accessModifier;

public class R {

    private static void printTex() {
        A a = new A();
        a.i = 15;
//        i = 10;
        System.out.println(a.i);
    }

    public static void main(String[] args) {
        printTex();
    }
}

class AccessDefault extends A {

    private void test() {
        System.out.println(i);
        System.out.println(defaultValue);
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    void defaultMethod() {
        super.defaultMethod();
    }
}
