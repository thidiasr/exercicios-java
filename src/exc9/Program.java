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
        System.out.printf("Seu imc é: %.2f\n",imc);

        if(imc<= 18.5){
            System.out.println("Abaixo do peso!");
        } else if (imc<=24.9) {
            System.out.println("Peso ideal, parabéns!");
        }else if (imc <=29.9){
            System.out.println("Levemente acima do peso!");
        }else if (imc <=34.9){
            System.out.println("Obesidade grau I ");
        }else if (imc <=39.9){
            System.out.println("Obesidade grau II (severa) ");
        }else{
            System.out.println("Obesidade grau III (mórbida)");
        }
        sc.close();
    }
}
