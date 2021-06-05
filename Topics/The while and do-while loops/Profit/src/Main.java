import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;


        float profit = m;
        float ratio = p/100f;

        while (profit < k) {
            years++;
            profit = profit * (1 + ratio);
        }
        System.out.println(years);
    }
}