package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ' ';
            }
        }

        printMatrix(matrix);

        String result = "playing";
        boolean isX = true;

        while (result.equals("playing")) {
            boolean validCoordinate = false;


            while (!validCoordinate) {
                System.out.print("Enter the coordinates: ");

                try {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();

                    if ((0 < x && x < 4) && (0 < y && y < 4)) {
                        validCoordinate = insertValue(matrix, x, y, isX);

                        if(!validCoordinate){
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                }

            }
            printMatrix(matrix);
            isX = !isX;
            result = evaluatesGame(matrix);
        }

        System.out.println(result);
    }

    private static String evaluatesGame(char[][] matrix) {

        String result = "playing";
        boolean playing = false;
        boolean xRowWins = false;
        boolean oRowWins = false;
        boolean xColWins = false;
        boolean oColWins = false;
        boolean xDiagWins = true;
        boolean oDiagWins = true;
        boolean xSecDiagWins = true;
        boolean oSecDiagWins = true;



        for (int i = 0; i < matrix.length; i++) {

                boolean xCurrentRowWins = true;
                boolean oCurrentRowWins = true;
                boolean xCurrentColWins = true;
                boolean oCurrentColWins = true;


            for (int j = 0; j < matrix[i].length; j++) {
                //check rows
                xCurrentRowWins = xCurrentRowWins && matrix[i][j] == 'X';
                oCurrentRowWins = oCurrentRowWins && matrix[i][j] == 'O';
                //check Cols
                xCurrentColWins = xCurrentColWins && matrix[j][i] == 'X';
                oCurrentColWins = oCurrentColWins && matrix[j][i] == 'O';

                playing = playing || matrix[i][j] == ' ';
            }
            xRowWins = xRowWins || xCurrentRowWins;
            oRowWins = oRowWins || oCurrentRowWins;

            //check Cols

            xColWins = xColWins || xCurrentColWins;
            oColWins = oColWins || oCurrentColWins;

            //check main diag
            xDiagWins = xDiagWins && matrix[i][i] == 'X';
            oDiagWins = oDiagWins && matrix[i][i] == 'O';

            //check secondary diag
            xSecDiagWins = xSecDiagWins && matrix[i][matrix.length - 1 - i] == 'X';
            oSecDiagWins = oSecDiagWins && matrix[i][matrix.length - 1 - i] == 'O';


        }

        boolean xWins =  xRowWins || xColWins || xDiagWins || xSecDiagWins;
        boolean oWins =  oRowWins || oColWins || oDiagWins || oSecDiagWins;

        if (xWins) {
            result = "X wins";
        } else if (oWins) {
            result = "O wins";
        } else if(!playing){
            result = "Draw";
        }

        return result;
    }

    private static boolean insertValue(char[][] matrix, int x, int y, boolean isX) {
        boolean result = false;

        x -= 1;
        y -= 1;

        if (matrix[x][y] == ' ') {
            if(isX){
                matrix[x][y] = 'X';
            } else {
                matrix[x][y] = 'O';
            }

            result = true;
        }

        return result;
    }

    public static void printMatrix(char[][] matrix){

        System.out.println("---------");
        for (char[] row: matrix) {
            System.out.print("| ");

            for (char cell: row) {
                System.out.print(cell);
                System.out.print(" ");
            }

            System.out.println("|");
        }
        System.out.println("---------");

    }

}
