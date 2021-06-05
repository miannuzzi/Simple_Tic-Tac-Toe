import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();


        boolean exist = false;
        
        for (int value: array) {
            if (value == n) {
                exist = true;
            }
        }
        
        if (exist) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
