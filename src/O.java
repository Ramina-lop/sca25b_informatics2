import java.util.Scanner;
public class O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b==a) {
            System.out.println(0);
        } else if (b>a) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }


    }
}