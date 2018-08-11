package primary_tutorial.designproblem;

import java.util.Random;
import java.util.Scanner;

/**
 * Shuffle an Array
 * 打乱一个没有重复元素的数组。
 *
 * 示例:
 *
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 *
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 *
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 */
public class ShuffleAnArray {
    public int[] nums;

    public ShuffleAnArray(int[] nums){
        this.nums = nums;
    }

    public int[] reset(){
        return nums;
    }


    public int[] shuffle(){
        if(nums == null || nums.length <= 0)
            return new int[0];
        int[] result = nums.clone();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int randpos = (int) (Math.random()*(len-i));
            int temp = result[randpos];
            result[randpos] = result[i];
            result[i] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
            for (int i = 0; i < 10; i++) {
                int[] result = shuffleAnArray.shuffle();
                for (int j = 0; j < n; j++) {
                    System.out.print(result[j] + " ");
                }
                System.out.println();
            }
            int[] result = shuffleAnArray.reset();
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

        }
    }
}
