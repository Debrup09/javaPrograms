package easyModerateProblems;

import java.util.Scanner;

public class secondMaxInArray {

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

    public static int findSecondMax (int[] arr) {
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max2 = arr[0];
            max1 = arr[1];
        }

        for (int i = 2; i<arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main (String[] args) {
        int[] num = arrayInit();
        int secondMax = findSecondMax(num);

        System.out.println(secondMax);
    }
}
