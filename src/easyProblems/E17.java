//program to flip the input and print it

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int flip, rev = 0;

        while (number != 0) {
            flip = number % 10;
            rev = rev * 10 + flip;
            number /= 10;
        }
        System.out.println(rev);
    }
}
