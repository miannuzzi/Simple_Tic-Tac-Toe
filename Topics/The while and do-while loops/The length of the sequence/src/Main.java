import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int c = 0;
        
        while (n != 0) {
            n = scanner.nextInt();
            if (n != 0) {
                c++;
            }
        }
        
        System.out.println(c);
    }
}
