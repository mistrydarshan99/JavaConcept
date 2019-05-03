package overload;

public class Tricky {

    public static void main(String[] args) {
        L z = new L();
        System.out.println(z.method(21.12));
        System.out.println(z.personName());

        K test = new L();
        System.out.println(test.method(21.12));
        System.out.println(test.personName());
    }
}

class J {
    int method(int i) {
        return i *= i;
    }
}

class K extends J {
    double method(double d) {
        return d /= d;
    }

    String personName(){
        return "Class K";
    }
}

class L extends K {
    float method(float f) {
        return f += f;
    }

    String personName(){
        return "Class L";
    }
}
