//this is a mortgage calculator

import java.text.NumberFormat;
import java.util.Scanner;

public class Qx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the principal amount you want to loan? : ");
        double principal = sc.nextDouble();

        System.out.print("What Annual Interest rent you want? : ");
        double annualInterest = sc.nextDouble();
        annualInterest = (annualInterest/100) / 12;

        System.out.print("How many years of mortgage would you like to loan? : ");
        double years = sc.nextDouble();

        double months = years * 12;

        double formula = Math.pow(1+annualInterest, months);

        double mortgage = principal * ((annualInterest*formula) / (formula - 1));
        System.out.println("Your Mortgage is " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
