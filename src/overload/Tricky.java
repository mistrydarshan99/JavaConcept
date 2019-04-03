package overload;

public class Tricky {

    public static void main(String[] args) {
        L z = new L();

        System.out.println(z.method(21.12));
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
}

class L extends K {
    float method(float f) {
        return f += f;
    }
}
