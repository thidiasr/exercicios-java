package exc15;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int year = sc.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        int month = sc.nextInt();
        System.out.print("Digite o dia do seu nascimento: ");
        int day = sc.nextInt();
        LocalDate birth = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birth, today);

        System.out.println("Você ja viveu: ");
        System.out.print(period.getYears() + " anos, ");
        System.out.print(period.getMonths() + " meses e ");
        System.out.print(period.getDays() + " dias");


        sc.close();
    }
}
