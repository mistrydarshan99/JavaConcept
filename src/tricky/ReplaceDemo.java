package tricky;

public class ReplaceDemo {

    public static void main(String[] args) {
        String str = " - Demo *";
        System.out.println(str.replaceAll("[*-]", "").trim());
    }
}
