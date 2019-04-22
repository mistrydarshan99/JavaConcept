package Inheritance;

public class ClassOne extends ClassTwo {

    static {
        i++;
    }

    static {
        --j;
    }

    @Override
    public void withOutStaticMethod() {
        System.out.println("Sub class method");
    }

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        System.out.println(i);
        System.out.println(j);

        classOne.withOutStaticMethod();

        ClassTwo classOne1 = new ClassOne();
        classOne1.withOutStaticMethod();
        System.out.println(i);
        System.out.println(j);

        ClassTwo classTwo = new ClassTwo();
        classTwo.withOutStaticMethod();
    }

}

class ClassTwo {

    static int i, j = 191919;

    {
        --i;
    }

    {
        j++;
    }

    public static void staticMethod() {
        System.out.println("Static Method is not override");
    }

    public void withOutStaticMethod() {
        System.out.println("Super class method & method is override ");
    }
}
