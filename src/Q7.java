// Find Prime Numbers

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        long num = sc.nextLong();
        long div = 2;
        boolean flag = true;

        while (div<num) {
            if (num%div==0) {
                flag = false;
                break;
            }
            div+=1;
        }

        if (flag==true) {
            System.out.println("It is Prime");
        } else {
            System.out.println("It is not Prime");
        }
    }
}
