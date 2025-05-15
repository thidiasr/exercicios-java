package exc12;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double price = sc.nextDouble();
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("\n" +
                " 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int choice = sc.nextInt();

        switch (choice){

            case 1:
                System.out.printf("Valor a pagar: %.2f",price*0.85);
            break;

            case 2:
                System.out.printf("Valor a pagar: %.2f",price*0.90);
                break;

            case 3:
                System.out.printf("Valor a pagar: %.2f",price);
                break;

            case 4:
                System.out.printf("Valor a pagar: %.2f",price*1.1);
                break;
        }

        sc.close();
    }
}
