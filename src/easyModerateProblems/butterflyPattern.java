//Butterfly Pattern

package easyModerateProblems;

import java.util.Scanner;

public class butterflyPattern {

    public static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            //Upper Half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i=n; i>=1; i--) {          //This was Shradha Di's Solution
//            //Bottom Half
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            for (int j=1; j<=2*(n-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        # This is My Solution - This is correct Too
        for (int i=1; i<=n; i++) {
            //Bottom Half
            for (int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
