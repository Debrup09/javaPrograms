//Diamond Pattern with *

package easyModerateProblems;

import java.util.Scanner;

public class patternProblem11 {

    public static void pattern(int n) {
        //Upper Half
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i+(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom Half
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i+(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
