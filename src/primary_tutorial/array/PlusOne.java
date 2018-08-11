package primary_tutorial.array;

import java.util.Scanner;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加1，返回一个新数组
 */
public class PlusOne {

    private static int[] plusOne(int[] digits){
        int carry = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(carry == 0){
                // 没有进位
                return digits;
            }
            int tmp = digits[i] + carry;
            carry = tmp/10;
            digits[i] = tmp % 10;
        }
        if(carry != 0){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                array[i] = in.nextInt();
            }
            int[] result = plusOne(array);
            for (int i = 0; i < result.length; i++) {
                System.out.printf(result[i] + " ");
            }
            System.out.println();
        }
    }
}
