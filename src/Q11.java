// print even numbers between 9 and 100

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim1 = 9, lim2 = 100;

        while (lim2>=lim1) {
            if (lim1%2 == 0) {
                System.out.print(lim1 + " ");
            }
            lim1 += 1;
        }
    }
}
