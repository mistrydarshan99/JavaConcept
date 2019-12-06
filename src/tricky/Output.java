package tricky;

public class Output {

    public static void main(String[] args) {

        foo(null);

        /*long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);*/

        OutPutNewOne outPutNewOne = new OutPutNewOne();
        outPutNewOne.setSalary(100);
        System.out.println(outPutNewOne.getSalary()); // 100
        OutPutNewOne outPutNewOne1 = newMethod(outPutNewOne);
        System.out.println(outPutNewOne.getSalary()); // 200
        System.out.println(outPutNewOne1.getSalary()); // 300
    }

    private static OutPutNewOne newMethod(OutPutNewOne outPutNewOne) {
        System.out.println(outPutNewOne.getSalary()); // 100
        outPutNewOne.setSalary(200);
        System.out.println(outPutNewOne.getSalary()); // 200
        outPutNewOne = new OutPutNewOne();
        outPutNewOne.setSalary(300);
        System.out.println(outPutNewOne.getSalary()); // 300
        return outPutNewOne;
    }

    public static void foo(Object o) {
        System.out.println("Object impl");
    }
    public static void foo(String s) {
        System.out.println("String impl");
    }
   /* public static void foo(OutPutNewOne outPutNewOne) {
        System.out.println("String impl");
    }*/
}

class OutPutNewOne{

    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
