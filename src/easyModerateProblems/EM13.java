// Pattern Problem - Creates a Hollow Rectangle using *

package easyModerateProblems;

import java.util.Scanner;

public class EM13 {

    public static void pattern(int m, int n) {
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if ( i==1 || i==m || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int cols = sc.nextInt();

        pattern(rows, cols);
    }
}
