// FizzBuzz interview question

import java.util.Scanner;

public class EM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Buzz");
        } else if (num % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }
    }
}
