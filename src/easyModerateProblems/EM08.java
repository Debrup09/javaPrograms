//Binomial Coefficient Calculator (Combinations of PnC)

package easyModerateProblems;

import java.util.Scanner;

public class EM08 {

    public static int fact(double n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int a, int b) {
        int upperBase = fact(a);
        int lowerBase = fact(b);
        int difference = fact(a - b);

        return upperBase / (lowerBase * difference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper base: ");
        int upperBase = sc.nextInt();
        System.out.println("Enter the lower base: ");
        int lowerBase = sc.nextInt();

        int answer = binomialCoefficient(upperBase, lowerBase);
        System.out.println(answer);

//        OLD CODE

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the upper base: ");
//        int upperBase = sc.nextInt();
//        System.out.println("Enter the lower base: ");
//        int lowerBase = sc.nextInt();
//
//        double difference = upperBase - lowerBase;
//
//        // Getting the factorial Values
//        upperBase = fact(upperBase);
//        lowerBase = fact(lowerBase);
//        difference = fact(difference);
//
//        //getting the binomial coefficient
//        double binomial;
//        binomial = upperBase / (lowerBase * difference);
//
//        //printing the answer as output
//        System.out.println("The binomial coefficient is: " + binomial);
    }
}
