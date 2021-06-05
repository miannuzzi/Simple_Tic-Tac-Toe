import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int c = 0;

        for (int value: array) {
            if (value == n) {
                c++;
            }
        }

        System.out.println(c);
    }
}