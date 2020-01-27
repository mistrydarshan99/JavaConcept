package Inheritance;

public class ClassOne extends ClassTwo {

    static {
        i++;
    }

    static {
        --j;
    }

    {
        System.out.println("Instance Block Class One");
    }

    public ClassOne() {
        System.out.println("This is class One Constructor");
    }

    @Override
    public void withOutStaticMethod() {
        System.out.println("Class One Sub class method");
    }

    public static void main(String[] args) {
        /*ClassOne classOne = new ClassOne();
        System.out.println(i);
        System.out.println(j);
        classOne.withOutStaticMethod();

        ClassOne classAgain = new ClassOne();
        System.out.println(i);
        System.out.println(j);
        classAgain.withOutStaticMethod();*/

        /*ClassTwo classOne1 = new ClassOne();
        classOne1.withOutStaticMethod();
        System.out.println(i);
        System.out.println(j);

        ClassTwo classTwo = new ClassTwo();
        classTwo.withOutStaticMethod();
        ClassTwo.staticMethod();*/

        System.out.println("-----------------New Logic-------------------");
//        ClassOne subObj = (ClassOne) new ClassTwo(); //Super class cannot be assign to subclass
//        subObj.withOutStaticMethod();
        ClassOne subObj = new ClassOne();
        subObj.withOutStaticMethod();
        ClassTwo parentObj = new ClassOne();
        parentObj.withOutStaticMethod();
        ClassTwo classTwo1 = new ClassTwo();
        classTwo1.withOutStaticMethod();
    }

}

class ClassTwo {

    static int i, j = 2;

    {
        --i;
    }

    {
        j++;
    }

    static {
        System.out.println("Static Block Class Two");
    }

    public ClassTwo() {
        System.out.println("This is class Two constructor");
    }

    public static void staticMethod() {
        System.out.println("Static Method is not override");
    }

    public void withOutStaticMethod() {
        System.out.println("Super class method & method is override ");
    }
}
