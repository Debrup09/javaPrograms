//Reverse an Array

package easyModerateProblems;

import java.util.Scanner;

public class reverseArray {

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

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void revArray(int[] arr) {
        int first = 0, last = arr.length - 1;
        int temp;
        while(first<last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] num = arrayInit();

        revArray(num);
    }
}
