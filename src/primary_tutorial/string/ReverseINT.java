package primary_tutorial.string;

import java.util.Scanner;

/**
 * 题目：颠倒整数
 *
 * @author starsea
 * @create 2018-06-05-下午1:41
 **/
public class ReverseINT {

    private static int reverse(int x){
        if(x == 0)
            return x;
        long result = 0;
        long xbak = x;
        boolean flag = true;
        if(x<0){
            flag = false;
            xbak = -xbak;
        }

        StringBuilder sb = new StringBuilder();
        while (xbak > 0){
            long mod = xbak%10;
            sb.append(mod);
            xbak = xbak / 10;
        }
        System.out.println(sb.toString());
        result = Long.valueOf(sb.toString());
        if(!flag){
            result = -result;
        }
        if(result<=Integer.MAX_VALUE && result>=Integer.MIN_VALUE) {
            return (int) result;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x = in.nextInt();
            int max = 1;
            int min = 1;
            for (int i = 0; i < 31; i++) {
                max *= 2;
            }
            max -= 1;
            for (int i = 0; i < 31; i++) {
                min *= 2;
            }
            min = -min;
            System.out.println("max="+max+"\nmin="+min);
            System.out.println("MAX="+Integer.MAX_VALUE+"\nMIN="+Integer.MIN_VALUE);
            System.out.println(reverse(x));
        }
    }
}
