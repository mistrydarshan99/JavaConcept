public class NestedForLoop {

    public static void main(String[] args) {

      /*  for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (j == 2) {
                    System.out.println("Breaking");
                    break;
                }
                System.out.println(i + " " + j);
            }
            break;
        }
        System.out.println("Done");*/


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (k == 2) {
                        System.out.println(i + " " + j + " " + k);
                        break;
                    }
                }
                break;
            }
            break;
        }
        System.out.println("Done");
    }
}
