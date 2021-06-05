import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ordered = false;
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        for (int i = 1; i < array.length;  i++)  {
            ordered = array[i-1].compareTo(array[i]) <= 0;
            if (!ordered) {
                break;
            }
        }

        System.out.println(ordered);
    }
}