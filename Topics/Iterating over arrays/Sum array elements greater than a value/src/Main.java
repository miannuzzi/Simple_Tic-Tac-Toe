import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        int sum = 0;
        for (int value: array) {
            if (value > n) {
                sum += value;
            }
        }

        System.out.println(sum);

    }
}