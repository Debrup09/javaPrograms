//Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, odd = 0, even = 0;

        System.out.println("(press 0 to proceed to the next step)");

        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
        } while (number != 0);

        System.out.println("Sum of Odd Numbers: " + odd);
        System.out.println("Sum of Even Numbers: " + even);
    }
}
