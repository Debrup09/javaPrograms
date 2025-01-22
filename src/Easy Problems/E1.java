// Code to swap the value of two variables

public class E1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);

        int temp = b;
        b = a;
        a = temp;

        System.out.println("a = " + a + ", b = " + b);
    }
}