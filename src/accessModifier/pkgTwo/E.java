package accessModifier.pkgTwo;

import accessModifier.A;

public class E /*extends A*/ {

    private void printText() {
        A a = new A();
//        System.out.println(a.i); i is not accessible
//        System.out.println(i);
    }
}
