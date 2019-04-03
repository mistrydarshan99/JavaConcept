package overload;

class SuperClass {
    Object superClassMethod() {
        return new Object();
    }
}

class SubClassTest1 extends SuperClass{
    @Override
    Object superClassMethod() {
        return 10;
    }
}