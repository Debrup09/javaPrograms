package easyModerateProblems;

import java.util.Arrays;
import java.util.Collections;
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

    public static Integer[] copyArr(Integer[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void printArray(Integer[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] num = arrayInit();
        Integer[] num0 = copyArr(num);
        Integer[] num1 = copyArr(num);
        Integer[] num2 = copyArr(num);

        Arrays.sort(num);
        Arrays.sort(num0, 0, 3);
        Arrays.sort(num1, Collections.reverseOrder());
        Arrays.sort(num2, 0, 3, Collections.reverseOrder());

        printArray(num);
        System.out.println();
        printArray(num0);
        System.out.println();
        printArray(num1);
        System.out.println();
        printArray(num2);
    }
}
