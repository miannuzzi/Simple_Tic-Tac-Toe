import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean continues = false;

        for (int i = 1; i < values.length; i++) {
            if ( (values[i-1] == n && values[i] ==m) || (values[i] == n && values[i -1] == m)) {
                continues = true;
            }
        }

        if (continues) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}