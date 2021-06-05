import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];
        int triples = 0;

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        for (int i = 2; i< n; i++){
            if (values[i] == (values[i-1] + 1)
                    && values[i-1] == (values[i-2] + 1)) {
                triples++;
            }
        }
        System.out.println(triples);

    }
}