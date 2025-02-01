//Binary Search

package easyModerateProblems;

public class EM25 {

    public static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;
        int result = binarySearch(num, key);

        if (result != -1) {
            System.out.println("Your key is at index " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
