package Inheritance;

public class MethodInheritance {
    public static void main(String[] args) {
        new MethodTwoClass().MethodTwoClass();
    }
}


class MethodOne
{
    void MethodOne()
    {
        System.out.println(1);
    }
}

class MethodTwoClass extends MethodOne
{
    void MethodTwoClass()
    {
        MethodOne();
    }
}
