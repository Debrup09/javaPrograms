// Array Basics - Largest Number in Array

package easyProblems;

public class E29 {

    public static int maxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {10, 6, 15, 8, 21, 14, 6};

        System.out.println("The largest Number is: " + maxNum(num));
    }
}
