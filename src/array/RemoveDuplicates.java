package array;

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int len = nums.length;
        int numbers = 0; //删除重复元素个数
        for(int i=0; i<len; i++){
            if(nums[i]!=nums[numbers]){
                numbers++;
                nums[numbers] = nums[i];
            }
        }
        numbers++;
        for(int i=0; i<numbers; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        return numbers;
    }
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       while(in.hasNext()){
           int n = in.nextInt();
           int[] nums = new int[n];
           for(int i=0; i<n; i++){
               nums[i] = in.nextInt();
           }
           System.out.println(removeDuplicates(nums));
       }
    }
}
