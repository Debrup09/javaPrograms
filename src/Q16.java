//Print a square using *

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square Length: ");
        int length = sc.nextInt();

        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= length; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
