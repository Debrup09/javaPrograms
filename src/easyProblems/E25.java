//Write a Java method to compute the average of three numbers.

package easyProblems;

import java.util.Scanner;

public class E25 {

    public static double add(int a, int b, int c){
        return a + b + c;
    }

    public static double average(int a, int b, int c) {
        double sum = add(a,b,c);
        return sum/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double answer = average(a,b,c);
        System.out.println("The average is: " + answer);
    }
}
