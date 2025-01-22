//find the greatest between two numbers

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("First one is Greater");
        } else if (num2>num1){
            System.out.println("Second one is Greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
