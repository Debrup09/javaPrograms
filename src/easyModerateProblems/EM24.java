//Linear Search

package easyModerateProblems;

import java.util.Scanner;

public class EM24 {

    public static int[] arrayInit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int limit = sc.nextInt();
        int[] num = new int[limit];

        for (int i=0; i<num.length; i++) {
            System.out.print("Enter a Number: ");
            num[i] = sc.nextInt();
        }

        return num;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = arrayInit();

        System.out.println("Enter the Number you want to Find: ");
        int key = sc.nextInt();

        if (linearSearch(num, key) == -1) {
            System.out.println("Invalid Number");
        } else {
            System.out.println("Your Requested Number is at index " + linearSearch(num, key));
        }
    }
}
