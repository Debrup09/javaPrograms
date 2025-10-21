package moderateProblems;

public class sumOfOddNumbersInArrayUsingRecursion {
    public static int recursion (int[] num, int len) {
        if (len == 0) {
            return num[len] % 2 != 0 ? num[len] : 0;
        }

        return (num[len] % 2 != 0 ? num[len] : 0) + recursion(num, --len);
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 5};
        int sum = recursion(a, a.length-1);
        System.out.println(sum);
    }
}
