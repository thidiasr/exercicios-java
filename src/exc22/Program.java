package exc22;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.printf("\nQuociente: %.2f\n",a/b);
        System.out.printf("Resto da divisão: %.0f",a%b);
        sc.close();
    }
}
