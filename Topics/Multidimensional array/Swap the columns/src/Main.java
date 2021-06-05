import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int is = scanner.nextInt();
        int js = scanner.nextInt();
        int swap = 0;

        for (int i = 0; i < n; i++) {
            swap = matrix[i][is];
            matrix[i][is] = matrix[i][js];
            matrix[i][js] = swap;
        }
        for (int[] row: matrix) {
            for (int cel: row) {
                System.out.print(cel + " ");
            }
            System.out.println();
        }
    }
}