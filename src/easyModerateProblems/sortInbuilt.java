package easyModerateProblems;

import java.util.Arrays;
import java.util.Scanner;

public class sortInbuilt {

    public static Integer[] arrayInit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int limit = sc.nextInt();
        Integer[] num = new Integer[limit];

        for (int i=0; i<num.length; i++) {
            System.out.print("Enter a Number: ");
            num[i] = sc.nextInt();
        }

        return num;
    }

    public static void printArray(Integer[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] num = arrayInit();

        Arrays.sort(num);

        printArray(num);
    }
}
