package exc20;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para saber a tabuada: ");
        double num = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.2f x %d = %.2f\n", num, i, num * i);
        }

        sc.close();
    }
}
