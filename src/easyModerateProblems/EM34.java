//Bubble Sort

package easyModerateProblems;

import moderateProblems.M01;

public class EM34 {

    public static int[] bubbleSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
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
        int[] sortedNum = bubbleSort(num);

        printArray(sortedNum);
    }
}
