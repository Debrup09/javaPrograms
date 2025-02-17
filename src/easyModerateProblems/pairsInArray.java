//Printing all possible pairs in an array

package easyModerateProblems;

public class pairsInArray {

    public static void arrPair(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<(arr.length-i); j++) {
                System.out.print("(" + arr[i] + "," + arr[i+j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6 ,8 ,10};

        arrPair(num);
    }
}
