//Simple calculator

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking two numbers as input
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        //Establishing the Functioning of the Calculator
        double cal = 0;
        System.out.println("Enter the operation you want to do: ");
        String op = sc.next();
        switch (op) {
            case "+": cal = a + b;
            break;
            case "-": cal = a - b;
            break;
            case "*": cal = a * b;
            break;
            case "/": cal = a / b;
            break;
            case "%": cal = a % b;
            break;
            default: System.out.println("Invalid operation");
        }

        //Printing the output
        System.out.println("Calculation: " + cal);
    }
}
