// Find Area of Circle

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius: ");
        double rad = sc.nextDouble();
        double pi = 3.14, area;

        area = pi * Math.pow(rad, 2);
        System.out.println("Area is: " + area);
    }
}
