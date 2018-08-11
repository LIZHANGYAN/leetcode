package dp;

import java.util.Scanner;

/**
 * 746. 使用最小花费爬楼梯
 *  数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 *  每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 *  您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 *
 * 示例1：
 *  输入: cost = [10, 15, 20]
 *  输出: 15
 *  解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 *
 * 示例2：
 *  输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 *  输出: 6
 *  解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 *
 * 分析：
 *  1.除去前两阶，每一阶都可以看做从上一阶或者上上一阶来的，
 *  2.到顶的时候可以是从最后一阶上来的也可以是从倒数第二阶上来的
 */
public class MinCostClimbingStairs {

    private static int minCostClimbingStairs(int[] cost){
        if(cost.length == 0)
            return 0;
        if(cost.length == 1)
            return cost[0];
        int[] f = new int[cost.length];
        f[0] = cost[0]; // 从第0阶上来
        f[1] = cost[1]; // 从第1阶上来

        for(int i=2; i<cost.length; i++){
            f[i] = Math.min(f[i-1]+cost[i], f[i-2]+cost[i]);
            for (int j = 0; j < cost.length; j++) {
                System.out.print(f[j]+"\t");
            }
            System.out.println();
        }
        return Math.min(f[cost.length-1],f[cost.length-2]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] costs = new int[n];
            for (int i = 0; i < n; i++) {
                costs[i] = in.nextInt();
            }
            System.out.println(minCostClimbingStairs(costs));
        }
    }
}
