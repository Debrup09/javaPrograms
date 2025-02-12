//Finding maximum and minimum elements in an array

package easyModerateProblems;

public class EM29 {
    public static int maxSubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    sum += arr[k];
                    if (sum>max) {
                        max = sum;
                    }
                }
            }
        }
        return  max;
    }

    public static int minSubArraySum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    sum += arr[k];
                    if (sum<min) {
                        min = sum;
                    }
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};

        System.out.println("Maximum Sum: " + maxSubArraySum(num));
        System.out.println("Minimum Sum: " + minSubArraySum(num));

    }
}
