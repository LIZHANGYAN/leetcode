package dp;

import java.util.Scanner;

/**
 * 303 区域和检索-不可变
 *  给定一个数组，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，
 *  包含 i,  j 两点。
 * 例如：
 *  给定nums = [-2, 0, 3, -5, 2, -1]，求和函数为sumRange()
 *  sumRange(0, 2) -> 1
 *  sumRange(2, 5) -> -1
 *  sumRange(0, 5) -> -3
 *
 * 分析:
 *  如果sumRange直接用循环的话会超时，
 *  在NumArray()中先把每个子序列的和计算出来保存到相同长度的数组中
 */
public class NumArray {
    private int[] sums;
    public NumArray(int[] nums){
        if(nums.length == 0)
            return;
        else{
            sums = new int[nums.length];
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j){
        for (int k :
                sums) {
            System.out.print(k+" ");
        }
        System.out.println();
        if(i == 0)
            return sums[j];

        return sums[j] - sums[i-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        NumArray numArray = new NumArray(nums);
        while (true){
            int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(numArray.sumRange(i, j));
        }
    }
}
