// Find the sum of n natural numbers

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int i, val = 0;

        for (i=1;i<=num;i++) {
            val+=i;
        }

        System.out.println("The sum is: " + val);
    }
}
