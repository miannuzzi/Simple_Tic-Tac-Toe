import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int i = 0;

        while (i < n){
            int value = scanner.nextInt();

            if (value < min){
                min = value;
            }

            i++;

        }

        System.out.println(min);
    }
}