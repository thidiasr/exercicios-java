package exc6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para reajustar 5%: ");
        double valor = sc.nextDouble();
        valor *= 1.05;
        System.out.print("O valor final acrescido de 5% é de: "+valor);
        sc.close();
    }
}
