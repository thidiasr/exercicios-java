package exc7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor menor ou igual a 10: ");
        double num = sc.nextDouble();
        boolean resultado1 = num <= 10;
        System.out.println("Digite entre 10 a 20: ");
        num = sc.nextDouble();
        boolean resultado2 = num >= 10 && num <= 20;
        if (resultado1 != resultado2) {
            if(resultado1) {
                System.out.println("Você foi tão bem na primeira, por que foi falso comigo na segunda? :(");
            }else {
                System.out.println("Você foi mal na primeira, mas pensou melhor na segunda resposta :|");
            }
        }else if(resultado1){
            System.out.println("Booa, você foi verdadeiro nas duas respostas! :D");
        }else{
            System.out.println("Não esperava isso de você, foi falso nas duas :O");
        }


        sc.close();
    }
}
