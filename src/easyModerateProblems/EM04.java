// Right-angled Triangle using * (Pattern Problem)

package easyModerateProblems;
import java.util.Scanner;

public class EM04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the Triangle: ");
        int length = sc.nextInt();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
