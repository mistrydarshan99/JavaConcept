package overload;

public class Tricky3 {

    public static void main(String[] args) {
        Derive derive = new Derive();
        System.out.println(derive.f(10));
        System.out.println(derive.f(10.0f));

        System.out.println("------------------New Logic-----------------");
        Base base = new Derive();
        System.out.println(base.f(20));
        System.out.println(base.f(20.0f));

        /*System.out.println("------------------New Logic-----------------");
        Base baseOne = new Derive();
        System.out.println(baseOne.f(10));
        System.out.println(baseOne.f(10L));*/
    }
}

class Base {
    public int f(int i) {
        System.out.print("Base f (int): ");
        return i + 3;
    }
    public double f(double i) {
        System.out.print("Base f (double) : ");
        return i + 3.3;
    }
}

class Derive extends Base{
    public float f(float i) {
        System.out.print("Derive f (float) : ");
        return i + 3.3f;
    }
    public int f(int i) {
        System.out.print("Derive f (int): ");
        return i + 3;
    }
}
