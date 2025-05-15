package exc17;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma temperatura em fahrenheit: ");
        double temp = sc.nextDouble();
        double conversao = 5 * (temp - 32) / 9;
        System.out.printf("%.2f°F convertido para celsius: %.2fºC", temp, conversao);

        sc.close();
    }
}

