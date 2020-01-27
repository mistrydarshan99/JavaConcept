import java.util.ArrayList;
import java.util.List;

public class Salary {

    public static void main(String[] args) {
        System.out.println("------------------New Logic----------------------");
        double salary = 2.0;
        Double mineSalary;
        doSomthign(salary);
        System.out.println(salary);
        mineSalary = salary;
        System.out.println(mineSalary);
        mineSalary = 5.0;
        System.out.println(mineSalary);
        System.out.println(salary);

//        List<Integer> list = new ArrayList<>();
//        list.add(3, 10);
//        System.out.println(list.size());

        System.out.println("------------------New Logic----------------------");
        Address address = new Address();
        address.setStreetName("Wakad");
        System.out.println(address.getStreetName());
        Address changeAddress = address;
        System.out.println(changeAddress.getStreetName());
        changeAddress.setStreetName("Bhumker chowk");
//        address.setStreetName("Gurukul");
        System.out.println(changeAddress.getStreetName());
        System.out.println(address.getStreetName());

        System.out.println("------------------New Logic----------------------");
        Address newAddress = new Address();
        newAddress.setStreetName("Maninagar");
        Address address1 = passByValue(newAddress);
        System.out.println(address1.getStreetName());
        System.out.println(newAddress.getStreetName());

    }

    private static Address passByValue(Address address){
        System.out.println(address.getStreetName());
        address.setStreetName("Hinzewadi");
        System.out.println(address.getStreetName());
//        Address addressLocalObj = address;
        Address addressLocalObj = new Address();
//        addressLocalObj = address;
//        address = addressLocalObj;
        addressLocalObj.setStreetName("Kumudnanagar");
        address.setStreetName("Noida");
//        addressLocalObj = address;
//        addressLocalObj.setStreetName("Sterling");
        System.out.println(address.getStreetName());
        System.out.println(addressLocalObj.getStreetName());
        return addressLocalObj;
    }

    private static void doSomthign(Double salary) {
        salary = salary + 2.0;
        System.out.println(salary);
    }

}

class Address {

    private String streetName;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
