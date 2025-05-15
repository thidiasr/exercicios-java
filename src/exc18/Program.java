package exc18;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int tamanhoFrancisco = 150;
        int tamanhoSara = 110;
        int contAnos = 0;
        while (tamanhoSara < tamanhoFrancisco) {
            tamanhoFrancisco += 2;
            tamanhoSara += 3;
            contAnos++;
        }
        System.out.printf("Sara demoraria %d anos para alcançar a altura de Francisco.", contAnos);
    }
}
