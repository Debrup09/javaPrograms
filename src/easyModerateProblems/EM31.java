// Max Subarray Sum using Kadane's Algorithm

package easyModerateProblems;

public class EM31 {

    public static void kadanes(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            currSum += arr[i];
            if (currSum<0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadanes(num);
    }
}
