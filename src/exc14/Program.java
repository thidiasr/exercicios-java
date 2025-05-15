package exc14;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        sc.close();
    }
}
