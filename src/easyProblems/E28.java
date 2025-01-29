//Array Basics

package easyProblems;

public class E28 {

    public static void update(int[] a) {
        for (int i=0; i<a.length; i++) {
            a[i] += 1;
        }
    }
    public static void main(String[] args) {
        int[] marks = {59, 64, 88};
        update(marks);

        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
