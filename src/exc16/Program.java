package exc16;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] lados = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº lado do triângulo: ", i + 1);
            lados[i] = sc.nextDouble();
            if (lados[i] < 0) {
                System.out.println("O número digitado não é aceito, digite novamente!");
                i--;
            }
        }
        if (lados[0] == lados[1] && lados[1] == lados[2]) {
            System.out.println("É um triângulo equilátero!");
        } else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
            System.out.println("É um triângulo isósceles!");
        } else {
            System.out.println("É um triângulo escaleno!");
        }
    }
}
