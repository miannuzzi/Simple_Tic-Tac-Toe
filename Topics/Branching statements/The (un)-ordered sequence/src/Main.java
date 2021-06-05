import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean ordered = true;
        boolean ascending = false;
        boolean descending = false;
        int previousNumber = scanner.nextInt();
        int number = scanner.nextInt();
        
        while (ordered && number != 0) {            
            
            if (!ascending && !descending && (previousNumber != number)) {                               
                
                if (previousNumber < number) {
                    ascending = true;
                } else {
                    descending = true;
                }
                
            }
            
            if (ascending) {
                ordered = previousNumber <= number;                
            } else {
                ordered = previousNumber >= number;
            }
            
            previousNumber = number;
            number = scanner.nextInt();
            
        } 
        
        System.out.println(ordered);
    }
}
