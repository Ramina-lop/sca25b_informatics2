import java.util.Scanner;

public class AD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a == 1 && b == 1) || (a != 1 && b != 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
