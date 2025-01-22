//Write a program to print the multiplication table of a number N, entered by the
//user.

import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int dec = 10, mult;

        for (int i = 1; i <= dec; i++) {
            mult = n*i;
            System.out.println(n + " x " + i + " = " + mult);
        }
    }
}
