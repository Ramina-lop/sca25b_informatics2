import java.util.Scanner;

public class J {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int total1= a*100+b;
        int total2=c*100+d;

        int cost=total2-total1;

        if (cost>=0) {
            int e = cost/100;
            int f = cost%100;
            System.out.println(e+" "+f);

        } else {
            System.out.println(" ");
        }














    }


}