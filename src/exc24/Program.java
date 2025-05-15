package exc24;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempo = sc.nextDouble();
        System.out.print("Digite a velocidade media: ");
        double velocidade = sc.nextDouble();
        double distancia = tempo*velocidade;
        System.out.printf("A distância percorrida foi: %.2f kms\n",distancia);
        System.out.printf("Gastou aproximadamente %.2fL de combustível!",distancia/12);

        sc.close();
    }
}
