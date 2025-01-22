//find the maximum among 3 numbers

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3 ){
            System.out.println("First number is greater");
        } else if(num1 < num2 && num2 > num3){
            System.out.println("Second Number is greater");
        }   else {
            System.out.println("Third1 Number is greater");
        }
    }
}
