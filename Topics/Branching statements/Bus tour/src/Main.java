import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int height = scanner.nextInt();
        int n = scanner.nextInt();
        int bridge = 0;
        
        for (int i = 0; i < n; i++) {
            int bridgeHeight = scanner.nextInt();
            if (height >= bridgeHeight) {
                bridge = i + 1;
                break;
            }
            
        }
        
        if (bridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + bridge);
        }
        
    }
}
