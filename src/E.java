import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int dx = Math.abs(a-c);
        int dy = Math.abs(b-d);
        if ((dx==1 && dy==2) || (dx==2 && dy==1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}