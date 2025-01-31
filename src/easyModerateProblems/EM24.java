//Linear Search

package easyModerateProblems;

public class EM24 {

    public static int linearSearch(int[] arr, int key) {
        for (int i=1; i<arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        if (linearSearch(num, key) == 0) {
            System.out.println("Invalid Number");
        } else {
            System.out.println("Your Requested Number is at index " + linearSearch(num, key));
        }
    }
}
