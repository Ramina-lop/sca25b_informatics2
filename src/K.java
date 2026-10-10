import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a!=1 && a!=2 && a!=4 && a!=7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}