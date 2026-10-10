
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a==c || b==d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}