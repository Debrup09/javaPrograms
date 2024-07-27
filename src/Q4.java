import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double c;

        System.out.println("Enter Celsius: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextDouble();
        double f = (c * (9 / 5)) + 32;

        System.out.println("Fahrenheit: " + f);
    }
}