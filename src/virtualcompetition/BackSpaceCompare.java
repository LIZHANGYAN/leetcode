package virtualcompetition;

import java.util.Scanner;

/**
 * 题目：844 比较含退格的字符串
 *
 * @author starsea
 * @create 2018-06-05-上午10:47
 **/
public class BackSpaceCompare {

    private static boolean backspaceCompare(String S, String T){
        boolean flag = true;
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        int st = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '#'){
                st = (st-1)<=0?0:--st;
            }else{
                s[st] = s[i];
                st++;
            }
        }
        for (int i = 0; i < st; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
        int tt = 0;
        for (int i = 0; i < t.length; i++) {
            if(t[i] == '#'){
                tt = (tt-1)<=0?0:--tt;
            }else{
                t[tt] = t[i];
                tt++;
            }
        }
        for (int i = 0; i < tt; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < st; i++) {
            if(s[i] != t[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String S = in.nextLine();
            String T = in.nextLine();
            backspaceCompare(S,T);

        }
    }
}
