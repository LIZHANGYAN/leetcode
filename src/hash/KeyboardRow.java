package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 500. 键盘行
 *  给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 * 示例1：
 *  输入: ["Hello", "Alaska", "Dad", "Peace"]
 *  输出: ["Alaska", "Dad"]
 */
public class KeyboardRow {

    private static String[] findWords(String[] words) {
        String row1 = "QWERTYUIOP";
        String row2 = "ASDFGHJKL";
        String row3 = "ZXCVBNM";

        List<String> list = new ArrayList<>();
        for(String word:
                words){
            boolean flag = true;
            char[] w = (word.toUpperCase()).toCharArray();
            String temp = null;
            if(row1.contains(String.valueOf(w[0]))){
                temp = row1;
            }else if(row2.contains(String.valueOf(w[0]))){
                temp = row2;
            }else{
                temp = row3;
            }
            for(int i=1; i<w.length; i++){
                if(!temp.contains(String.valueOf(w[i])) && flag)
                    flag = false;
            }
            if(flag)
                list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            String[] words = new String[N];
            for (int i = 0; i < N; i++) {
                words[i] = in.next();
            }
            String[] result = findWords(words);
            for (String s :
                    result) {
                System.out.println(s);
            }

        }
    }
}
