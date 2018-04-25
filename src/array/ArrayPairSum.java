package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组拆分：
 *  给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 *  例如 (a1, b1), (a2, b2), ..., (an, bn) ，
 *  使得从1 到 n 的 min(ai, bi) 总和最大。
 * 示例1：
 *  输入: [1,4,3,2]
 *
 *  输出: 4
 *  解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 */
public class ArrayPairSum {

    public static int arrayPairSum(int[] nums){
        //int n = nums.length/2;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            int n = in.nextInt();
            int[] arrays = new int[2*n];
            for (int i = 0; i < 2 * n; i++) {
                arrays[i] = in.nextInt();
            }
            System.out.println(arrayPairSum(arrays));
        }
    }
}
