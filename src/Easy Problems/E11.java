// print even numbers between chosen numbers

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper and lower limit numbers: ");
        int lim1 = sc.nextInt();
        int lim2 = sc.nextInt();

        while (lim2>=lim1) {
            if (lim1%2 == 0) {
                System.out.print(lim1 + " ");
            }
            lim1 += 1;
        }
    }
}
