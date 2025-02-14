//Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct.

package easyModerateProblems;

import java.util.Scanner;

public class EM33 {

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

    public static boolean checkRepeat(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = arrayInit();

        boolean isRepeat = checkRepeat(num);
        System.out.println(isRepeat);
    }
}
