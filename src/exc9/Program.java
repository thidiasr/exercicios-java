package exc9;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura (exp: 1,65):");
        double altura = sc.nextDouble();
        double imc = altura*altura;
        imc = peso / imc;
        System.out.printf("Seu imc é: %.2f",imc);




        sc.close();
    }
}
