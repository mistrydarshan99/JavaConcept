package tricky;

/**
 * Java program to demonstrate that private method can not be overridden in Java.
 * This Java programs calls both private and non private method with child class
 * object on constructor of parent class.
 * Only non private method of Child class invoked while private method of
 * Parent class is invoked, Which confirms that private method can not be overridden in Java
 * and only be hidden if we declare same message in Child class.
 *
 * @author
 */
public class PrivateMethodCanNotBeOverriden {

    private int count = 0;
    static int $_ = 5;

    public static void main(String args[]) {

//        if (true)
//            break;

        System.out.println('j' + 'a' + 'v' + 'a');
        System.out.println($_);

        //shows that private method can not be overridden in Java     
        Child parent = new Child();
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        PrivateMethodCanNotBeOverriden instance = new PrivateMethodCanNotBeOverriden();
        System.out.println(instance.count++);
    }


}

class Parent {

    public Parent() {
        name();
        normal();
    }

    private void name() {
        System.out.printf("private method inside Parent class in Java %n");
    }

    public void normal() {
        System.out.println("non private method from Parent class can be overridden");
    }

}

class Child extends Parent {

    /*
     * Private method can not be overridden in Java, they can only be hidden
     */
    private void name() {
        System.out.printf("private method inside Child class in Java %n");
    }

    @Override
    public void normal() {
        System.out.println("non private overridden method from Child class ");
    }

}