import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int n = 0;
        do {
            n = scanner.nextInt();
            
            if (max < n) {
                max = n;
            }
        } while (n != 0);
        
        System.out.println(max);
    }
}
