// Solid Rhombus Pattern using *

package easyModerateProblems;

import java.util.Scanner;

public class patternProblem9 {

    public static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n+(n-i); j++) {
                if (j<=n-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
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
