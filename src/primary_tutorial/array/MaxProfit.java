package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：买卖股票的最佳时机 II
 */
public class MaxProfit {

    private static int maxProfit(int[] prices){
        if(prices.length <= 1 || prices == null)
            return 0;
        int totalProfit = 0;
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n-1; i++) {
            if(prices[i] < prices[i+1]){
                profit = prices[i+1] - prices[i];
                totalProfit += profit;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int totalprofit = maxProfit(array);
            System.out.println("totalProfit = " + totalprofit);

        }
    }
}
