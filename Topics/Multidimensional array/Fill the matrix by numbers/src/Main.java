import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        //int[][] matrix = new int[n][n];
                
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)     {
               // maxtrix[i][j] = Math.abs(i - j);
                System.out.print(Math.abs(i - j) + " ");
            }
            System.out.println();
        }
    }
}
