import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        boolean ordered = true;
        int i = 0;
        int previousValue = 0;

        while (ordered && i < length) {
            i++;
            int value = scanner.nextInt();

            if (previousValue > value) {
                ordered = false;
            }

            previousValue = value;

        }
        System.out.println(ordered);
    }
}