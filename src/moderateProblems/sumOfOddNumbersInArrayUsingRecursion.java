package moderateProblems;

public class sumOfOddNumbersInArrayUsingRecursion {
    public static int recursion (int[] num, int len) {
        if (len == 0) {
            if (num[len] % 2 != 0) {
                return num[len];
            } else {
                return 0;
            }
        }
        if (num[len] % 2 != 0) {
            return num[len] + recursion(num, --len);
        } else {
            return recursion(num, --len);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2};
        int sum = recursion(a, a.length-1);
        System.out.println(sum);
    }
}
