// Average of 3 Numbers taken as input

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double avg = 0;
        avg = (double) (num1 + num2 + num3) / 3;

        System.out.println(avg);
    }
}
