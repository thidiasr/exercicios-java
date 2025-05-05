package exc2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = sc.nextDouble();
        String resultado = num > 0 ? num%2 == 0 ? num+" é um número par!": num+" é um número ímpar":num + " é um número negativo!";

        System.out.println(resultado);

        sc.close();
    }
}
