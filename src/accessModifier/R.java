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
