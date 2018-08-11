package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：存在重复
 *
 * @author starsea
 * @create 2018-06-05-上午10:12
 **/
public class ContainsDuplicate {

    private static boolean containsDuplicate(int[] nums){
        boolean flag = false;
        if(nums.length < 2 )
            return true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j > 0; j--) {
                if(nums[i] == nums[j]){
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

        }
    }
}
