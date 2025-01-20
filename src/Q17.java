//program to flip the input and print it

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int flip = 0;

        while (number != 0) {
            flip = number % 10;
            System.out.print(flip);
            number /= 10;

        }
    }
}
