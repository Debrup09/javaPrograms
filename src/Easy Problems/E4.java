// Program to Convert Celsius to Fahrenheit

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        double celsius;

        System.out.println("Enter Celsius: ");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}