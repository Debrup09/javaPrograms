//Sum of n natural numbers without using loop

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
