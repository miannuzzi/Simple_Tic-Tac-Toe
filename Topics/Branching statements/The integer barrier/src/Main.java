import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        do {
            n = scanner.nextInt();

            sum += n;

            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        } while (n!=0);

        System.out.println(sum);

    }
}