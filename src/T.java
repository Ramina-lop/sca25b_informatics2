import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ax2 + bx + c = 0.

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D =  (b*b)-(4*a*c);
        if (D>0) {
            double x1 = (-b+Math.sqrt(D))/(2.0*a);
            double x2 = (-b-Math.sqrt(D))/(2.0*a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (D==0) {
            double x = -b/(2.0*a);
            System.out.println(x);
        }



    }

}