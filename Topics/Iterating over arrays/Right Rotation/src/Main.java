import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int shift = scanner.nextInt();

        String[] array = input.split(" ");
        String[] result = new String[array.length];

        if (shift > array.length) {
            shift = shift % array.length;
        }

        for (int i = 0; i < array.length; i++){

            int index = i + shift;

            if (index >= array.length){
                index = Math.abs(array.length - shift - i);
            }
            result[index] = array[i];
        }

        for (String value: result) {
            System.out.print(value + " ");
        }

    }
}