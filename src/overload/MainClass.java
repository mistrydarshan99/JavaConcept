package overload;

class X {
    void calculate(int a, int b) {
        System.out.println("Class X");
    }
}

class Y extends X {
    @Override
    void calculate(int a, int b) {
        System.out.println("Class Y");
    }
}

class Z extends Y {
    @Override
    void calculate(int a, int b) {
        System.out.println("Class Z");
    }
}

class A {
    public A(int i) {
        System.out.println(1);
    }

    public A() {
        this(10);

        System.out.println(2);
    }

    void A() {
        A(10);

        System.out.println(3);
    }

    void A(int i) {
        System.out.println(4);
    }
}


public class MainClass {
    public static void main(String[] args) {
        X x = new Y();

        x.calculate(10, 20);

        Y y = (Y) x;

        y.calculate(50, 100);

//        Z z = (Z) y; //It gives ClassCastException

//        z.calculate(100, 200);

//        new A().A();

        method(12);
        method((short) 12);
//        method(null);
        method(10.0);
        method(11.15);
    }

    {
        System.out.println(1);
    }

    static void method(Double d) {
        System.out.println(2);
    }

    static void method(Float d) {
        System.out.println(99);
    }

    static void method(Number n) {
        System.out.println(4);
    }

    static void method(Object o) {
        System.out.println(5);
    }

    static void method(Integer o) {
        System.out.println(6);
    }
}


abstract class AbstractClass {

    public abstract void test();

    void test1() {
        System.out.println("Test 1");
    }
}

class ExtedAbstract extends AbstractClass {

    @Override
    public void test() {

    }

    @Override
    void test1() {
        super.test1();
    }
}

interface MyInterface {
    double d = 10;
}

abstract class Calculate {

    int[][][] a = new int[5][5][5];

    String[] oneDArray = new String[] {"ONE", "TWO", "THREE", "FOUR", "FIVE"};


    String[][] twoDArray = new String[][]{
            {"ONE", "TWO", "THREE", "FOUR"},
            {"FIVE", "SIX", "SEVEN"},
            {"EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"}
    };

    String[][][] threeDArray = new String[][][]{
            {
                    {"ONE", "TWO", "THREE"},
                    {"FOUR", "FIVE", "SIX", "SEVEN"}
            },
            {
                    {"EIGHT", "NINE", "TEN", "ELEVEN"},
                    {"TWELVE", "THIRTEEN", "FOURTEEN"}
            },
            {
                    {"FIFTEEN", "SIXTEEN"},
                    {"SEVENTEEN", "EIGHTEEN", "NINETEEN"},
                    {"TWENTY", "TWENTY ONE"}
            }
    };

    abstract int add(int a, int b);
}

class MainClassAbstract {
    public static void main(String[] args) {
        int result = new Calculate() {
            @Override
            int add(int a, int b) {
                return a + b;
            }
        }.add(11010, 022011);
        System.out.println(result);
    }
}