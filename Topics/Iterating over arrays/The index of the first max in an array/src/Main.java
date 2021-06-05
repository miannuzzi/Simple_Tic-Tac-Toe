import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] values = new int[length];
        int maxIndex = 0;

        for (int i = 0; i < values.length; i++){

            values[i] = scanner.nextInt();

            if (values[i] > values[maxIndex]){
                maxIndex = i;
            }

        }

        System.out.println(maxIndex);

    }
}