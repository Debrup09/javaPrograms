package easyModerateProblems;

import java.util.Scanner;

public class numberSystemConverter {

    public static boolean isBinary(int n) {
        boolean b = true;
        while(n!=0) {
            int lastDigit = n%10;
            if (lastDigit > 1) {
                b = false;
                break;
            } else {
                n/=10;
            }
        }
        return b;
    }

    public static int binaryToDec(int n) {
        int decValue = 0;
        for (int i = 0; n != 0; i++) {
            decValue += (int) ((n % 10) * Math.pow(2, i));
            n /= 10;
        }
        return decValue;
    }

    public static int decToBinary(int n) {
        int dig, binValue = 0, pow = 0;
        while (n>0) {
            dig = n%2;
            binValue = (binValue + (dig * (int) Math.pow(10, pow)));
            pow++;
            n/=2;
        }
        return binValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Zero to Convert Binary to Decimal\nPress One to Convert Decimal to Binary: ");
        int choice = sc.nextInt();
        int answer;

        if (choice == 0) {
            System.out.println("Enter a Binary Number: ");
            int bin = sc.nextInt();
            if (isBinary(bin)){
                answer = binaryToDec(bin);
                System.out.println(answer);
            } else {
                System.out.println("Invalid Operation!");
            }

        } else if (choice == 1){
            System.out.println("Enter a Decimal Number: ");
            int dec = sc.nextInt();
            answer = decToBinary(dec);
            System.out.println(answer);
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
