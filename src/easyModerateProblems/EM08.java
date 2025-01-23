//Binomial Coefficient Calculator (Combinations of PnC)

package easyModerateProblems;

import java.util.Scanner;

public class EM08 {

    public static double fact(double n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper base: ");
        double upperBase = sc.nextInt();
        System.out.println("Enter the lower base: ");
        double lowerBase = sc.nextInt();
        double difference = upperBase - lowerBase;

        // Getting the factorial Values
        upperBase = fact(upperBase);
        lowerBase = fact(lowerBase);
        difference = fact(difference);

        //getting the binomial coefficient
        double binomial;
        binomial = upperBase / (lowerBase * difference);

        //printing the answer as output
        System.out.println("The binomial coefficient is: " + binomial);
    }
}
