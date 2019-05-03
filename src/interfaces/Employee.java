package interfaces;

public class Employee {

    private int salary;

    protected void incrementSalary(){
        System.out.println("1000 Rs increment");
    }

    public static void main(String[] args) {
        SalesPerson salesPerson = new SalesPerson();
        salesPerson.incrementSalary();

        DeskRepresentive deskRepresentive = new DeskRepresentive();
        deskRepresentive.incrementSalary();
    }
}

class SalesPerson extends Employee{

    @Override
    protected void incrementSalary() {
        System.out.println("2000 RS");
    }
}

class DeskRepresentive extends Employee{

    @Override
    protected void incrementSalary() {
        System.out.println("500 RS");
    }
}
