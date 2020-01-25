package StringExampls;

public class StingDemo {

    public static void main(String[] args) {
       /* String s1 = "Darshan is am clever boy."; // Store sting in String Pool
        String str1 = "abcdefg"; // Store sting in String Pool
        String str2 = str1.substring(2, 5);
        System.out.println(str2);
        System.out.println(s1.substring(7, 10));

        System.out.println(s1.substring(1, 1));

        String s2 = new String("Darshan"); // Store string in heap memory
        String s3 = new String("Darshan").intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println("Using equals " + s2.equals(s3));

        ImmutableClass immutableClass = new ImmutableClass(1, "Darshan");

        String compare = "Darshan";
        System.out.println("Darshan".equals(compare));
        System.out.println("----------------------------");
        if ("Darshan" == compare) {
            System.out.println("Done");
        }

        String compareNull = null;
        System.out.println(compareNull.equals("Darshan"));*/

        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1 == s2);//false because reference variables are pointing to different instance
        System.out.println(s2 == s3);//true because reference variables are pointing to same instance
        System.out.println(s1 == s3);
    }
}
