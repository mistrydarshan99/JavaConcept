package overload;

public class Overloading {


//
//   ___                 _                 _ _
//  / _ \__   _____ _ __| | ___   __ _  __| (_)_ __   __ _
// | | | \ \ / / _ \ '__| |/ _ \ / _` |/ _` | | '_ \ / _` |
// | |_| |\ V /  __/ |  | | (_) | (_| | (_| | | | | | (_| |
//  \___/  \_/ \___|_|  |_|\___/ \__,_|\__,_|_|_| |_|\__, |
//                                                   |___/
//
//  1) Method Name   2) Number Of Arguments   3) Types of arguments.
//  static polymorphism
//  Method overloading is the best example of static binding
//
//  Is it possible to have two methods in a class with same method signature but different return types?
//  No, compiler will give duplicate method error. Compiler checks only method signature for duplication not the return types. If two methods have same method signature, straight away it gives compile time error.
//
//  Java doesn't support operator overloading

    private void sum() {

    }


    private void sum(int num1) {

    }

    private void sum(float num1) {

    }

    private void sum(float num1, int num2) {

    }

    private void sum(int num1, float num2) {

    }

    private void methodOverloaded() {
        //No argument, private method
    }

    private int methodOverloaded(int i) {
        //One argument private method
        return i;
    }

    protected int methodOverloaded(double d) {
        //Protected Method
        return 0;
    }

    public void methodOverloaded(int i, double d) {
        //Public Method
    }


  /*  private int multiply(int num){
        return 0;
    }

    private String multiply(int num){
        return "0";
    }*/

}
