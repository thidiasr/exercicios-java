package exc13;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.printf("Olá %s",name);
        if(age<18){
            System.out.print(", acabei de ver que você é menor idade!");
        }else{
            System.out.print(", acabei de ver que você é maior idade!");
        }
        sc.close();
    }
}
