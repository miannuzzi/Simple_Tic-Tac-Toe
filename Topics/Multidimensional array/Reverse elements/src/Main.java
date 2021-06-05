import java.util.*;

class ArrayOperations {

   /* public static void main(String[] args) {
        int[][] matrix = {{0,0,5,9,9},
                {1,2,9,3,4},{5,6,0,7,8}
        };
        reverseElements(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }*/
    public static void reverseElements(int[][] twoDimArray) {

        int swap = 0;

        for (int i = 0; i < twoDimArray.length ; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                swap = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j];
                twoDimArray[i][twoDimArray[i].length - 1 - j] = swap;

            }
        }
    }
}