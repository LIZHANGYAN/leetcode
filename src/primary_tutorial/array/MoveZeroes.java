package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：移动零
 * 给定一个数组nums，把所有的0移到数组末尾，不改变非零元素位置
 */
public class MoveZeroes {

    private static void moveZeros(int[] nums){
        int i=0; // 指向第一个0
        int j=0; // 正常指针

        for (; j<nums.length; j++){
            if(nums[j] != 0){
                if(i<j){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                array[i] = in.nextInt();
            }
            moveZeros(array);
        }
    }
}
