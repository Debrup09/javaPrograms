package easyProblems;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int dig1 = 0;
        int dig2 = 1;

        System.out.print(0 + " " + 1 + " ");

        for (int i=3; i<=num; i++) {
            int x = dig1 + dig2;
            dig1 = dig2;
            dig2 = x;
            System.out.print(dig2 + " ");
        }
    }
}
