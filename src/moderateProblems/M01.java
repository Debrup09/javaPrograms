//Trapping Rainwater

package moderateProblems;

import java.util.Scanner;

public class M01 {

    public static int[] arrayInit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int limit = sc.nextInt();
        int[] num = new int[limit];

        for (int i=0; i<num.length; i++) {
            System.out.print("Enter a Number: ");
            num[i] = sc.nextInt();
        }

        return num;
    }

    public static int[] leftAux(int[] arr) {
        int[] leftAux = new int[arr.length];
        leftAux[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            leftAux[i] = Math.max(arr[i], leftAux[i - 1]);
        }
        return leftAux;
    }

    public static int[] rightAux(int[] arr) {
        int[] rightAux = new int[arr.length];
        rightAux[arr.length-1] = arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--) {
            rightAux[i] = Math.max(arr[i], rightAux[i + 1]);
        }
        return rightAux;
    }

    public static int trappedWater(int[] leftAux, int[] rightAux, int[] height) {
        int trappedWater = 0;
        for (int i=0; i<height.length; i++) {
            int waterLevel = Math.min(leftAux[i], rightAux[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = arrayInit();

        int[] leftAux = leftAux(height);
        int[] rightAux = rightAux(height);

        int trappedWater = trappedWater(leftAux, rightAux, height);
        System.out.println("The Trapped Water is: " + trappedWater);
    }
}
