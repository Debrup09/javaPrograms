//Palindromic Pyramid Pattern with Numbers

package easyModerateProblems;

import java.util.Scanner;

public class patternProblem13 {
    public static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            //Initial Gap
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //Prints i to 1
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //Prints 2 to i
            for (int j=2; j<=i; j++) {
                System.out.print(j);
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
