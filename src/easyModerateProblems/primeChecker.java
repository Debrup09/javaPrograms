package easyModerateProblems;

import java.util.Scanner;

public class primeChecker {

    public static boolean isPrime(int n) {
        int i = 2;

        if (n==2) {
            return true;
        } else if (n<2) {
            System.out.println("Enter Valid Input");
        }

        while (i <= Math.sqrt(n)) {        // Either sqrt of n or less than n is fine
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
