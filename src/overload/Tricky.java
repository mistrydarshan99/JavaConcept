package overload;

public class Tricky {

    public static void main(String[] args) {
        L z = new L();
        System.out.println(z.method(10.0f));
        System.out.println(z.personName());
        System.out.println(z.printClassName("L"));
        System.out.println(z.param);

        System.out.println("---------------New Logic-------------------");
        J test = new L();
        System.out.println(test.method(50.0f));
        System.out.println(test.personName());
        System.out.println(test.printClassName("J"));
        System.out.println(test.param);

    }
}

class J {
    int param = 10;

    int method(int i) {
        System.out.println("Class J Method");
        return i;
    }

    double method(double i) {
        System.out.println("Class J Method");
        return i;
    }

    String personName() {
        return "Class K";
    }

    String printClassName(String className){
        return "printClassName L";
    }
}

class K extends J {

    int param = 20;

    double method(double d) {
        System.out.println("Class K Method");
        return d;
    }

    String personName() {
        return "Class K";
    }

    String printClassName(String className){
        return "printClassName L";
    }
}

class L extends K {

    int param = 30;

    float method(float f) {
        System.out.println("Class L Method");
        return f;
    }

    String personName() {
        return "Class L";
    }

    String printClassName(String className){
        return "printClassName L";
    }

    /*@Override
    double method(double d) {
        System.out.println("Class L Override");
        return d;
    }*/
}
