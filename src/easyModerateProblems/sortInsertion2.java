package easyModerateProblems;

import java.util.Scanner;

public class sortInsertion2 {

    public static int[] insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }

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

    public static void main(String[] args) {
        int[] num = arrayInit();
        int[] sortedNum = insertionSort(num);

        printArray(sortedNum);
    }
}
