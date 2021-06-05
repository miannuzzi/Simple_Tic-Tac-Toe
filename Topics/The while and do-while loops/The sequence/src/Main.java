import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int i = 0;
        int max = 0;
        int value = 0;
        boolean isDivisibleBy4 = false;
        
        while(i<length){
            i++;
            value = scanner.nextInt();
            isDivisibleBy4 = (value % 4) == 0;
            if (isDivisibleBy4 && (value > max)){
                max = value;
            }
        }        
        
        System.out.println(max);
    }
}
