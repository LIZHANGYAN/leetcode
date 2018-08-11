package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：旋转数组
 *
 * @author starsea
 * @create 2018-06-05-上午9:48
 **/
public class RotateArray {

    private static void rotate(int[] nums, int k){
        rotate2(nums, k);
    }

    /**
     * 空间复杂度O(n)
     * @param nums
     * @param k
     */
    private static void rotate1(int[] nums, int k){
        int n = nums.length;
        int[] bak = new int[n];

        for (int i = 0; i < n; i++) {
            bak[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.printf(bak[i]+" ");
        }
        System.out.println();
    }

    /**
     * 利用交换实现空间复杂度O(1)
     * @param nums
     * @param k
     */
    private static void rotate2(int[] nums, int k){
        int count = k%nums.length;
        int pr = nums.length - count;
        reverse(nums, 0, pr-1);
        reverse(nums, pr, nums.length-1);
        reverse(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i]+" ");
        }
        System.out.println();
    }

    private static void reverse(int[] nums, int st, int end){
        while(st < end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int k = in.nextInt();
            rotate(array, k);
        }
    }

}
