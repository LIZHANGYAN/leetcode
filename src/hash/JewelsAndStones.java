package hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 771. 宝石与石头
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *  S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *  J 中的字母不重复，J 和 S中的所有字符都是字母。
 *  字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例1：
 *  输入: J = "aA", S = "aAAbbbb"
 *  输出: 3
 * 示例2：
 *  输入: J = "z", S = "ZZ"
 *  输出: 0
 */
public class JewelsAndStones {
    private int numJewelsInStones(String J, String S){
        Set<Character> jewelset = new HashSet<>();
        for(int i=0; i<J.length(); i++){
            jewelset.add(J.charAt(i));
        }
        int num = 0;
        for(int i=0; i<S.length(); i++){
            if(jewelset.contains(S.charAt(i)))
                num++;
        }
        return num;
    }

    private int numJewelsInStones2(String J, String S){
        int num = 0;
        char[] ss = S.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if(J.contains(String.valueOf(ss[i]))){
                num++;
            }
        }

        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String J = in.nextLine();
            String S = in.nextLine();

        }
    }
}
