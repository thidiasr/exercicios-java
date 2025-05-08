package exc8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] nums = new Integer[3];
        int temp;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº número inteiro: ",i+1);
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Ordem Decrescente:");
        for (int num : nums){
            System.out.println(num);
        }
        sc.close();
    }
}
