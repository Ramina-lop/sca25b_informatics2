import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();


        if (n<=k) {
            int a =m*2;

            System.out.println(a);
        } else {
            int b =(n*2+k-1)/k*m;
            System.out.println(b);
        }

    }
}