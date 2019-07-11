package overload;


public class Tricky2 {

    public static void main(String[] args) {

   /*     G g = new B();
        g.methodOne();
        System.out.println(g.i);

        ABC abc = new XYZ();
        abc.methodABC(10);
        abc.methodABC();*/

//        N n = new N(26);

//        KA y = new KA();


        ABCD a = new ABCD();
        BCD b = new BCD(a);
        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(b.a.i);
        b.a.i = 2121;
        System.out.println("--------");
        System.out.println(a.i);
        System.out.println(b.i);
    }

}

class G {

    int i = 10;

    void methodOne() {
        System.out.println("AAA");
    }

    void myMethodDarshan() {

    }
}

class B extends G {

    int i = 20;

    void methodOne() {
        System.out.println("BBB");
    }

    static void methodTwoThree() {

    }

    @Override
    void myMethodDarshan() {
        super.myMethodDarshan();
    }
}

class ABC {
    void methodABC() {
        System.out.println(111);
    }

    void methodABC(int i) {
        System.out.println(222);
    }
}

class XYZ extends ABC {
    @Override
    void methodABC(int i) {
        System.out.println(333);
    }

    @Override
    void methodABC() {
        System.out.println(444);
    }
}

class M {
    int i;

    public M(int i) {
        this.i = i--;
    }
}

class N extends M {
    public N(int i) {
        super(++i);
        System.out.println(i);
    }
}


class JK {
    int m = 1111;

    {
        m = m++;
        System.out.println(m);
    }
}

class KA extends JK {
    {
        System.out.println(methodOfY());
    }

    int methodOfY() {
        return m-- + --m;
    }
}

class ABCD {
    int i = 1212;
}

class BCD extends ABCD {
    ABCD a;

    public BCD(ABCD a) {
        this.a = a;
    }
}

class ClassOneTwo {
    static int i, j = 191919;

    {
        --i;
    }

    {
        j++;
    }
}

class ClassTwoThird extends ClassOneTwo {
    static {
        i++;
    }

    static {
        --j;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
    }
}

class ArrayDemo
{
    int[] a = new int[5];
    {
        a[0] = 10;
    }
}
class MainClassDemoTest extends ArrayDemo
{
    {
        a = new int[5];
    }
    {
        System.out.println(a[0]);
    }
    public static void main(String[] args)
    {
        MainClassDemoTest main = new MainClassDemoTest();
    }
}

class A5
{
    static int i;
    static
    {
        i++;
    }
    {
        ++i;
    }
}
class B5 extends A5
{
    static
    {
        --i;
    }
    {
        i--;
    }
}
class MainClass_5
{
    public static void main(String[] args)
    {
        System.out.println(new B5().i);
    }
}


class X2
{
    static
    {
        Y2.methodOfY();
    }
}
class Y2 extends X2
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}
 class MainClass6
{
    public static void main(String[] args)
    {
        Y2.methodOfY();
        ClassTwo2 classTwo2 = new ClassTwo2();
    }
}


class ClassOne1
{
    static int i = 111;

    int j = 222;

    {
        i = i++ - ++j;
    }
}
class ClassTwo2 extends ClassOne1
{
    {
        j = i-- + --j;
    }
}
