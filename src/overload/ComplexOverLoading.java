package overload;

/**
 * Priority : Primitive > object > SuperObject
 */
public class ComplexOverLoading {

    public static void main(String[] args) {
        method(12);
        method((short) 12);
        method((float) 12);
//        method(null);
        method(10.0);
        method(11.15);
        method(11L);

        System.out.println("--------------------New Logic---------------------");
        method(10.0);
        method(10L);
        method(10.0f);
    }

    static void method(Double d) {
        System.out.println("Double coming");
    }

    static void method(Float d) {
        System.out.println("Float coming");
    }

    static void method(Number n) {
        System.out.println("Number coming");
    }

    static void method(Object o) {
        System.out.println("Object coming");
    }

    static void method(Integer o) {
        System.out.println("Integer coming");
    }

    static void method(int number) {
        System.out.println("primitive int coming");
    }

    static void method(long number) {
        System.out.println("primitive long coming");
    }

    static void method(float number) {
        System.out.println("primitive float coming");
    }

    static void method(double d) {
        System.out.println("primitive Double coming");
    }
}
