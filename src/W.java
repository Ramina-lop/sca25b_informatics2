import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int b60 = n / 60;
        int left = n % 60;

        int b1 = 0, b5 = 0, b10 = 0, b20 = 0;

        // 1. Пограничный случай для билета на 60
        if (left >= 36) {
            b60 += 1;
        } else {
            // 2. Пограничный случай для билета на 20 (18 и 19 поездок)
            if (left >= 18) {
                b20 = 1;
                left -= 20; // left может стать отрицательным (-1 или -2), это нормально
            }

            // 3. Пограничный случай для билета на 10 (9 поездок)
            if (left >= 9) {
                b10 = 1;
                left -= 10;
            }

            // 4. Распределяем остатки на билеты по 5 и по 1
            if (left >= 5) {
                b5 = 1;
                left -= 5;
            }

            if (left > 0) {
                b1 = left;
            }
        }

        // Вывод всех 5 чисел
        System.out.println(b1 + " " + b5 + " " + b10 + " " + b20 + " " + b60);
    }
}