public class Main {

    public static void main(String[] args) {

        Number number = 10.0 * 10;
        System.out.println(number);

        System.out.println("Hello World!");
        String str = "HEllo";
        String str1 = "HEllo";
        String str2 = new String("HEllo");
        String str3 = new String("HEllo");
//        String str3 = "HEllo";



        if (str == str1) {
            System.out.println("First block True");
        } else {
            System.out.println("First block False"); //""
        }

        if (str1 == str2) {
            System.out.println("Second block True");
        } else {
            System.out.println("Second block False");
        }

        if (str2 == str3) {
            System.out.println("Third block True");
        } else {
            System.out.println("Third block False");
        }
    }




}
