import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (Math.abs(c-a)<=1 && Math.abs(d-b)<=1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}