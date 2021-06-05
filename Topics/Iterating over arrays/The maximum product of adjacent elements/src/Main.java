import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        int max = 0;
         
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i] * array[i-1];
            
            if (max < currentValue) {
                max = currentValue;
            }
        }
        
        System.out.println(max);
    }
}
