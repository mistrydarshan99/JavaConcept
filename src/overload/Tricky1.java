package overload;

public class Tricky1 {

    public static void main(String[] args)
    {
        ClassOne one = new ClassOne();

        one.method("JAVA");

        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if (str == str2){
            System.out.println("str true");
        }else{
            System.out.println("str false");
        }

        if (str2 == str3){
            System.out.println("str2 true");
        }else{
            System.out.println("str2 false");
        }

        if (str3 == str){
            System.out.println("str3 true");
        }else{
            System.out.println("str3 false");
        }

        if (str3 == str4){
            System.out.println("str4 true");
        }else{
            System.out.println("str4 false");
        }

        if (str4.equals(str3)){
            System.out.println("Equals true");
        } else{
            System.out.println("Equals false");
        }
    }
}

class ClassOne
{
    void method(String s1)
    {
        method(s1, s1+s1);
    }

    void method(String s1, String s2)
    {
        method(s1, s2, s1+s2);
    }

    void method(String s1, String s2, String s3)
    {
        System.out.println(s1+s2+s3);
    }
}
