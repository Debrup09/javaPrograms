//Best Time To Buy & Sell Stock

package moderateProblems;

import java.util.Scanner;

public class M02 {

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

    public static void maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i=1; i<prices.length; i++) {
            int sellingPrice = prices[i];
            minPrice = Math.min(prices[i], minPrice);
            int buyingPrice = minPrice;

            int profit = sellingPrice - buyingPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        int[] prices = arrayInit();

        maxProfit(prices);
    }
}
