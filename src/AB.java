import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        if (X == 100) {
            System.out.println("C");
        } else {
            if (X >= 90) {
                System.out.print("XC");
                X -= 90;
            } else if (X >= 50) {
                System.out.print("L");
                X -= 50;
            } else if (X >= 40) {
                System.out.print("XL");
                X -= 40;
            }

            if (X >= 10) {
                System.out.print("X");
                X -= 10;
                if (X >= 10) {
                    System.out.print("X");
                    X -= 10;
                }
                if (X >= 10) {
                    System.out.print("X");
                    X -= 10;
                }
            }

            if (X >= 9) {
                System.out.print("IX");
                X -= 9;
            } else if (X >= 5) {
                System.out.print("V");
                X -= 5;
            } else if (X >= 4) {
                System.out.print("IV");
                X -= 4;
            }

            if (X >= 1) {
                System.out.print("I");
                X--;
            }
            if (X >= 1) {
                System.out.print("I");
                X--;
            }
            if (X >= 1) {
                System.out.print("I");
            }
        }
    }
}