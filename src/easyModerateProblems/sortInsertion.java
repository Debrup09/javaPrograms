//Insertion Sort

package easyModerateProblems;

import java.util.Scanner;

public class sortInsertion {

    public static int[] insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] < arr[j]) {
                    for (int k=i; k>j; k--) {
                        int temp = arr[k];
                        arr[k] = arr[k-1];
                        arr[k-1] = temp;
                    }
                    break;
                }
            }
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
