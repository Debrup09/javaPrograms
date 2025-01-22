//Keep entering numbers and the code will stop when you enter a multiple of 10

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        } while (num % 10 != 0);
    }
}
