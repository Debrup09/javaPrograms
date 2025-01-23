package easyModerateProblems;

import java.util.Scanner;

public class EM10 {

    public static boolean isPrime(int n) {
        int i = 2;

        if (n == 2) {
            return true;
        }

        while(i<=Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Upper limit: ");
        int upperLimit = sc.nextInt();
        System.out.println("Enter Lower limit: ");
        int lowerLimit = sc.nextInt();

        String out;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                out = "Prime";
            } else {
                out = "Not Prime";
            }
            System.out.println("Number " + i + " is :" + out);
        }
    }
}
