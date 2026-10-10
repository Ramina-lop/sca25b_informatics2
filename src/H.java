import java.util.Scanner;

public class H {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //ax*b=0
        if (a==0) {
            if (b==0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }


        } else {
            if ((b%a==0)) {
                System.out.println(-b/a);
            } else {
                System.out.println("NO");
            }

        }


    }


}