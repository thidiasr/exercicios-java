package exc4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.printf("Antecessor: %d%n" +
                "Sucessor: %d ",num-1, num+1);
        sc.close();
    }
}
