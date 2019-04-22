package accessModifier.pkgTwo;

import accessModifier.A;

public class E {

    private void printText() {
        A a = new A();
//        System.out.println(a.i); i is not accessible
    }
}
