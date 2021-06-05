import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int pow;

        for (int i = 1; i <= n; i++ ) {
            pow = (int) Math.pow(i, 2);

            if (pow > n) {
                break;
            }

            System.out.println(pow);
        }
    }
}