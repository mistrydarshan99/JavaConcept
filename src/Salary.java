import java.util.ArrayList;
import java.util.List;

public class Salary {

    public static void main(String[] args) {
        Double salary = new Double(2.0);
        Double mineSalary;

        doSomthign(salary);
        System.out.println(salary);

        mineSalary = salary;
        System.out.println(mineSalary);

        mineSalary = 5.0;
        System.out.println(mineSalary);
        System.out.println(salary);

        List<Integer> list = new ArrayList<>();
        list.add(3,10);
        System.out.println(list.size());
    }

    private static void doSomthign(Double salary) {
        salary = salary + 2.0;
    }

}
