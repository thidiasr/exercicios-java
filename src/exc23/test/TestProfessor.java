package exc23.test;

import exc23.dominio.Professor;

import java.util.Locale;
import java.util.Scanner;

public class TestProfessor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite qual o valor pago por hora: ");
        double hourValue = sc.nextDouble();
        System.out.print("Digite a quantidade de aulas lecionadas: ");
        int classes = sc.nextInt();
        System.out.print("Digite a porcentagem de desconto do INSS: ");
        double inss = sc.nextDouble();
        Professor professor = new Professor(hourValue, classes, inss);
        professor.salaryCalculate();
        System.out.printf("Seu salário esse mês é de %.2f",professor.getsalary());

        sc.close();
    }
}
