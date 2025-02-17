//Insertion Sort

package easyModerateProblems;

import moderateProblems.M01;

public class EM36 {

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
        return M01.arrayInit();
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
