import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if ((A % 2 == 0 || B % 2 == 0 || C % 2 == 0) &&
                (A % 2 != 0 || B % 2 != 0 || C % 2 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}