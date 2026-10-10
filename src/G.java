import java.util.Scanner;

public class G {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a%4==0 || a==1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}