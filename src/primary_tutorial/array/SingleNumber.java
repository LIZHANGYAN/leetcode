package primary_tutorial.array;

import java.util.Scanner;

/**
 * 题目：只出现一次的数字
 *
 * @author starsea
 * @create 2018-06-06-上午10:01
 **/
public class SingleNumber {

    private static int singleNumber(int[] nums){
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            System.out.println(singleNumber(array));
        }
    }
}
