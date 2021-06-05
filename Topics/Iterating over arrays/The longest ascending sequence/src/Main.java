import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;
        int length = 0;
        int max = 0;
        int value, previousValue = 0;

        while (i < n){

            value = scanner.nextInt();


            if (value < previousValue) {
                if ( length > max) {
                    max = length;
                }

                length = 0;
            }
            length++;

            previousValue = value;
            i++;

        }

        if(length > max) {
            System.out.println(length);
        } else {
            System.out.println(max);
        }

    }
}