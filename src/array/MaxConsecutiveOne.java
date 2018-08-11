package array;

import java.util.Scanner;

/**
 * 485 最大连续1的个数
 *  给定一个二进制数组， 计算其中最大连续1的个数。
 * 示例1；
 *  输入: [1,1,0,1,1,1]
 *  输出: 3
 *  解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
public class MaxConsecutiveOne {

    private static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0)
            return 0;
        int max = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] == 1)
                temp++;
            if(temp > max)
                max = temp;
            if(nums[i] == 0)
                temp = 0;
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = in.nextInt();
            }
            System.out.println(findMaxConsecutiveOnes(nums));
        }
    }
}
