package dp;

import java.util.Scanner;

/**
 给定一个序列（至少含有 1 个数），从该序列中寻找一个连续的子序列，使得子序列的和最大。

 例如，给定序列 [-2,1,-3,4,-1,2,1,-5,4]，
 连续子序列 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums){

        /** 双重循环效率太低
        int maxsum = nums[0];
        int s = 0, e = 0;
        for(int i=0; i<nums.length; i++){
            int submaxsum = 0;

            for(int j=i; j<nums.length; j++){
                submaxsum = submaxsum+nums[j];
                if(maxsum<submaxsum) {
                    maxsum = submaxsum;
                    s = i;
                    e = j;
                }
            }

        }*/

        if(nums.length == 0)
            return 0;
        int sum = nums[0];
        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(temp>0)
//                temp += nums[i];
//            else
//                temp = nums[i];
//            if(sum < temp)
//                sum = temp;
//        }
        for (int i = 0; i < nums.length; i++) {
            temp = (temp + nums[i])>nums[i]?(temp+nums[i]):nums[i];
            sum = sum < temp?temp:sum;
        }


        return sum;
    }
    public static int maxSubArray2(int[] a){
        int maxSum = 0;
        int sum;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++){
                nums[i] = in.nextInt();
            }
            System.out.println(maxSubArray(nums));
        }
    }
}
