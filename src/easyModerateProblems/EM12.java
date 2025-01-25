//Write a Java program to check if a number is a palindrome in Java?

package easyModerateProblems;

import java.util.Scanner;

public class EM12 {

    public static int rev(int n) {
        int lastDigit, rev = 0;

        while (n != 0) {
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        if(n == rev(n)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
