import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean simetric = true;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                simetric = simetric && matrix[i][j] == matrix[j][i];
            }
        }

        if (simetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}