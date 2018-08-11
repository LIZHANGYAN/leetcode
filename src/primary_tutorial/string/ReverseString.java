package primary_tutorial.string;

import java.util.Scanner;

/**
 * 题目：反转字符串
 *
 * @author starsea
 * @create 2018-06-05-下午1:06
 **/
public class ReverseString {
    private static String reverseString(String s){
        if(s.length() <= 1 || s==null)
            return s;
        char[] ch = s.toCharArray();
        int len = ch.length;
        for (int i = 0, j = len-1; i < j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            System.out.println(reverseString(s));
        }
    }
}
