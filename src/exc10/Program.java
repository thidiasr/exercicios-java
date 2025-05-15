package exc10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a sua %dº nota: ",i+1);
            notas[i] = sc.nextDouble();
        }
        double media = notas[0] + notas[1] + notas[2];
        media = media/3;
        System.out.printf("Sua média é: %.2f",media);
        sc.close();
    }
}
