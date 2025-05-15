package exc21;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random rdm = new Random();
        System.out.println(rdm.nextInt(100));
    }
}
