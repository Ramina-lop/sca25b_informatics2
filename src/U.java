import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ax2 + bx + c = 0.

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;

        a = min;
        b = middle;
        c = max;

        if (a+b<=c) {
            System.out.println("impossible");
        } else if (a*a+b*b==c*c) {
            System.out.println("right");
        } else if (a*a+b*b>c*c) {
            System.out.println("acute");
        } else if (a*a+b*b<c*c) {
            System.out.println("obtuse");
        }



    }

}