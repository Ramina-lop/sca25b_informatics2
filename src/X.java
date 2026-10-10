import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int b1 = 0, b5 = 0, b10 = 0, b20 = 0, b60 = 0;

        b60 = n / 60;
        int left = n % 60;

        if (left >= 36) {
            b60++;
        } else {
            if (left >= 18) {
                b20++;
                left -= 20;
            }

            if (left >= 9) {
                b10++;
                left -= 10;
            }

            if (left >= 4) {
                b5++;
                left -= 5;
            }

            if (left > 0) {
                b1 = left;
            }
        }

        System.out.println(b1 + " " + b5 + " " + b10 + " " + b20 + " " + b60);
    }
}