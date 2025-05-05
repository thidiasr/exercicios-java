package exc1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }
        String resultado = numeros[0] + numeros[1] < numeros[2] ? "que é menor que " + numeros[2] : "que é maior que " + numeros[2];

        System.out.printf("%.2f + %.2f = %.2f %s", numeros[0], numeros[1], numeros[0] + numeros[1], resultado);

        sc.close();
    }
}
