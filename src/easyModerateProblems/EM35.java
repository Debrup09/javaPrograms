//Selection Sort

package easyModerateProblems;

import moderateProblems.M01;

public class EM35 {

    public static int[] selectionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        int[] sortedNum = selectionSort(num);

        printArray(sortedNum);
    }
}
