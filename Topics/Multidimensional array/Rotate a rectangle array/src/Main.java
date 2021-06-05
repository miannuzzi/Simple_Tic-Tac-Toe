import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //int[][] input = new int[n][m];
        int[][] matrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][n - 1 - i] = scanner.nextInt();
            }
        }
        for (int[] row: matrix) {
            for (int cel: row) {
                System.out.print(cel + " ");
            }
            System.out.println();
        }
        
    }
}