import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int c = 0;
        
        while(c!=n){
            i++;
            for(int j = 0; j < i; j++){
                System.out.print(i);
                c++;
                if (c==n){
                    break;
                } else { 
                    System.out.print(" ");
                }
            }
        }
    }
}
