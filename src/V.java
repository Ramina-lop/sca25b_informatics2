import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = "korov";

        if (n % 10 == 1 && n % 100 != 11) {
            word = "korova";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 12 || n % 100 > 14)) {
            word = "korovy";
        }

        System.out.println(n + " " + word);




    }
}