import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 1; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }
        array[0] = scanner.nextInt();

        for (int value: array) {
            System.out.print(value + " ");
        }

    }
}