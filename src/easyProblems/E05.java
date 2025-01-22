// Calculate Simple Interest

import java.util.Scanner;
public class E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a Program that finds out the Amount after implementing Simple Interest!");

        System.out.println("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.println("Enter Simple Interest: ");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Time: ");
        int time = sc.nextInt();

        double Amount = principal + (principal*rateOfInterest*time)/100;

        System.out.println("Final Amount: " + Amount);
    }
}