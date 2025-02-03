//print sub arrays

package easyModerateProblems;

public class EM28 {

    public static void printSubArrays(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("[" + arr[i]);
                for (int k=i+1; k<=j; k++) {
                    System.out.print("," + arr[k]);
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};

        printSubArrays(num);
    }
}
