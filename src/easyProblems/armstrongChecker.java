package easyProblems;

import java.util.Scanner;

public class armstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int original = num;
        int cubicSum = 0;
        int dig;

        while (num != 0) {
            dig = num % 10;
            cubicSum += Math.pow(dig, 3);
            num /= 10;
        }

        if (cubicSum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
