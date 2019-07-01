package StringExampls;

public class StingDemo {

    public static void main(String[] args) {
        String s1 = "Darshan is am clever boy."; // Store sting in String Pool
        String str1 = "abcdefg"; // Store sting in String Pool
        String str2 = str1.substring(2, 5);
        System.out.println(str2);
        System.out.println(s1.substring(7, 10));

        System.out.println(s1.substring(1, 1));

        String s2 = new String("Darshan"); // Store string in heap memory
        String s3 = new String("Darshan").intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        ImmutableClass immutableClass = new ImmutableClass(1, "Darshan");

        String compare = "Darshan";
        System.out.println("Darshan".equals(compare));

        String compareNull = null;
        System.out.println(compareNull.equals("Darshan"));
    }
}
