import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        //(ax+b):(cx+d)=0

        if (a==0) {
            if (b==0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (b%a==0) {
                int x = -b/a;
                if (c*x+d!=0) {
                    System.out.println(x);
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

        }


    }


}