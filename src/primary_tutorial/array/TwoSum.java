package primary_tutorial.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目：两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数u
 */
public class TwoSum {

    private static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        if(nums == null || nums.length == 0)
            return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
           int diff = target - nums[i];
           if(map.containsKey(diff)){
               if(i!=map.get(diff)) {
                   result[0] = i;
                   result[1] = map.get(diff);
                   break;

               }
           }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                array[i] = in.nextInt();
            }
            int target = in.nextInt();
            int[] result = twoSum(array, target);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
