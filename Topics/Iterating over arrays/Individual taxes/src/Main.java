import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] incomes = new double[n];
        double[] taxes = new double[n];

        for (int i = 0; i < incomes.length; i++ ) {
            incomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < taxes.length; i++ ) {
            taxes[i] = scanner.nextInt();
        }

        double max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            double currentValue =  incomes[i] * taxes[i] / 100;
            if (currentValue > max){
                max = currentValue;
                index = i;
            }
        }

        System.out.println(index + 1);
    }
}