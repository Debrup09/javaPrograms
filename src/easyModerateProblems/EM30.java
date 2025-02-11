// Max Sum of Sub Array using Prefix Array Method

package easyModerateProblems;

public class EM30 {

    public static int maxSubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i< prefix.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {

                int sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (sum>max) {
                    max = sum;
                }

            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};

        System.out.println("Maximum Sum: " + maxSubArraySum(num));
    }
}
