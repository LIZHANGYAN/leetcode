package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：从排序数组中删除重复选项
 */
public class RemoveDuplicates {

    private static int removeDuplicates(int[] nums){
        if(nums.length == 0 || nums == null)
            return 0;
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i] != nums[count]){
                nums[++count] = nums[i];
            }
        }

        count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int len = removeDuplicates(array);
            System.out.println("len="+len);
            for (int i = 0; i < len; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
