//Binary Search

package easyModerateProblems;

import java.util.Scanner;

public class EM25 {

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

    public static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = arrayInit();
        System.out.println("Enter the number you want to find: ");
        int key = sc.nextInt();
        int result = binarySearch(num, key);

        if (result != -1) {
            System.out.println("Your key is at index " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
