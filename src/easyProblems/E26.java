//Program to identify if a number is Even or not

package easyProblems;

import java.util.Scanner;

public class E26 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
