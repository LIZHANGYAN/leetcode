package dp;

import java.util.Scanner;

/**
 *
 *
 * 买卖股票的最佳时机
 *  给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *  如果你最多只允许完成一笔交易（即买入和卖出一支股票），
 *  设计一个算法来计算你所能获取的最大利润。
 *  注意你不能在买入股票前卖出股票。
 *
 * 示例1：
 *  输入: [7,1,5,3,6,4]
 *  输出: 5
 *  解释: 在第 2 天（股票价格 = 1）的时候买入，
 *  在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *  注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 示例2：
 *  输入: [7,6,4,3,1]
 *  输出: 0
 *  解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class BestTImeToBuyAndSell {

    private static int maxProfit(int[] prices){


        /* 效率太低
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length ; j++) {
                if(prices[j] > prices[i]){
                    if(prices[j]-prices[i] > result)
                        result = prices[j] - prices[i];
                }
            }
        }*/

        // 只需要遍历一遍
        /**
         * 因为选中prices[i]作为买入价，卖出价只能在i...后查找，
         * 只需要遍历一遍即可
         */
        if(prices == null || prices.length == 0)
            return 0;

        int result = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(min > prices[i])
                min = prices[i]; // 找到最低的买入价
            else{
                if(result < prices[i] - min) {
                    result = prices[i] - min;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            System.out.println(maxProfit(array));
        }
    }
}
