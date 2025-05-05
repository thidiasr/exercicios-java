package exc3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double[] numeros = new double[2];
        double num = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }
        if (numeros[0] == numeros[1]) {
            num = numeros[0] + numeros[1];
            System.out.printf("%.2f + %.2f = %.2f", numeros[0], numeros[1], num);
        } else {
           num = numeros[0] * numeros[1];
            System.out.printf("%.2f + %.2f = %.2f", numeros[0], numeros[1], num);
        }

    }
}
