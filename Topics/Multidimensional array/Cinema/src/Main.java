import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int seats = scanner.nextInt();
        int row = 0;

        for (int i = 0; i < n; i++){
            int sum = 0;
            int c = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
                if (sum == 0){
                    c++;
                    if(c == seats){
                        row = i + 1;
                        break;
                    }
                } else {
                    c = 0;
                    sum = 0;
                }
            }
            if (row != 0){
                break;
            }
        }

        System.out.println(row);
    }
}