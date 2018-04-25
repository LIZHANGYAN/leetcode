package dp;

import java.util.Scanner;

/**
 * 爬楼梯
 *  假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 *  每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *  注意：给定 n 是一个正整数。
 * 示例1：
 *  输入： 2
 *  输出： 2
 *  解释： 有两种方法可以爬到楼顶。
 *  1.  1 步 + 1 步
 *  2.  2 步
 *
 * 示例2：
 *  输入： 3
 *  输出： 3
 *  解释： 有三种方法可以爬到楼顶。
 *  1.  1 步 + 1 步 + 1 步
 *  2.  1 步 + 2 步
 *  3.  2 步 + 1 步
 * 分析：
 *  最优子结构：爬n-1步有多少中方法
 *  边界： n=1,n=2时
 *  状态转移方程： F(n) = F(n-1)+F(n-2)
 */
public class ClimbStairs {

    private static int climbStairs(int n){

        int pre = 1;
        int cur = 2;

        if(n == 1)
            return pre;
        if(n == 2)
            return cur;

        for (int i = 3; i <= n; i++) {
            int temp = pre + cur;
            pre = cur;
            cur = temp;
        }

        return cur;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(climbStairs(n));
        }

    }
}
