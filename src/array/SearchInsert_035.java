package array;

import java.util.Scanner;

/**
 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 你可以假设在数组中无重复元素。

 案例 1:
 输入: [1,3,5,6], 5
 输出: 2

 案例 2:
 输入: [1,3,5,6], 2
 输出: 1

 案例 3:
 输入: [1,3,5,6], 7
 输出: 4

 案例 4:
 输入: [1,3,5,6], 0
 输出: 0
 */
public class SearchInsert_035 {
    public static int searchInsert(int[] nums, int target){
        int index = 0;
        int i=0;
        for(; i<nums.length; i++){
            if(nums[i] >= target) {
                index = i;
                break;
            }
        }
        if(i==nums.length)
            index = i;
        return index;
    }
    public static int searchInsertBinary(int[] nums, int target){
        int index = 0;
        int lo = 0;
        int hi = nums.length-1;


        while(lo<=hi){
            int mid = (hi - lo)/2;
            if(nums[lo]>=target) {
                index = lo;
                break;
            }
            if(nums[hi]<target){
                index = hi+1;
                break;
            }
            if(nums[hi]==target){
                index = hi;
                break;
            }
            if(nums[mid]==target){
                index = mid;
                break;
            }
            if(target>nums[mid]){
                lo = mid+1;
                continue;
            }
            if(target<nums[mid]){
                hi = mid-1;
                continue;
            }

        }
        return index;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = in.nextInt();
            }
            int target = in.nextInt();
            System.out.println(searchInsertBinary(nums, target));
        }
    }
}
