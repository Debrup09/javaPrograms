//Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of: ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
