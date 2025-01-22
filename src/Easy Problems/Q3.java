// Program to Calculate Total Tax

public class Q3 {
    public static void main(String[] args) {
        int sales = 95_000;
        double incomeTaxRate = 0.04;
        double GST = 0.02;

        double incomeTax = sales * incomeTaxRate;
        double GSTPaid = sales * GST;
        double totalTax = incomeTax + GSTPaid;

        System.out.println("Total Sales: " + sales);
        System.out.println("Income Tax Rate: " + incomeTax);
        System.out.println("GST: " + GSTPaid);
        System.out.println("Total Tax: " + totalTax);
    }

}