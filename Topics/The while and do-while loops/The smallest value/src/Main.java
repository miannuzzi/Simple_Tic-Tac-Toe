import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long fact = 1;
        int n = 0;

        while (fact <= m) {
            fact = 1;
            n++;

            for (int i = 1; i <= n; i++){
                fact *= i;
            }
        }

        System.out.println(n);
    }
}