import java.util.Scanner;
public class Z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = "bochek";

        if (n % 10 == 1 && n % 100 != 11) {
            word = "bochka";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 12 || n % 100 > 14)) {
            word = "bochki";
        }

        System.out.println(n + " " + word);




    }
}