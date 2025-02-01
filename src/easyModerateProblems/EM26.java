//Reverse an Array

package easyModerateProblems;

public class EM26 {

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void revArray(int[] arr) {
        int first = 0, last = arr.length - 1;
        int temp;
        while(first!=last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] num = {4, 6, 5 ,2 ,8};

        revArray(num);
    }
}
