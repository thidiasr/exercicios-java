package exc5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float salarioMinimo = 1293.20f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        float salarioUsuario = sc.nextFloat();
        float quantidadeSalarios = salarioUsuario/salarioMinimo;
        System.out.printf("Você ganha %d salários minimos!",(int)quantidadeSalarios);


        sc.close();
    }
}
