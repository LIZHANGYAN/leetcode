package array;

import java.util.Scanner;

/**
 * 283 移动0
 *  给定一个数组 nums, 编写一个函数将所有 0 移动到它的末尾，
 *  同时保持非零元素的相对顺序。
 *  例如， 定义 nums = [0, 1, 0, 3, 12]，
 *  调用函数之后， nums 应为 [1, 3, 12, 0, 0]。
 */
public class MoveZeros {

    private static void moveZeroes(int[] nums){
        if(nums == null || nums.length == 0)
            return;
        for (int i = 0, j=0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(i!=j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = in.nextInt();
            }
            moveZeroes(nums);
            for (int i = 0; i < N; i++) {
                System.out.print(nums[i]+" ");
            }
        }
    }
}
