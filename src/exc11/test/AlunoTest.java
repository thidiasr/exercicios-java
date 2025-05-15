package exc11.test;
import exc11.dominio.Aluno;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a sua %dº nota: ",i+1);
            notas[i] = sc.nextDouble();
        }
        Aluno aluno = new Aluno(nome,notas[0],notas[1],notas[2],notas[3]);
        aluno.calculaMedia();
        System.out.printf("Sua nota final é: %.2f\n%s",aluno.getMedia(),aluno.getSituacaoFinal());

        sc.close();
    }
}
