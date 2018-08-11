package dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 638.Shopping Offers 购物优惠
 *  超市里有一些商品，组合购买会有优惠，根据购物清单和对应的优惠使得花的钱最少
 * 示例1：
 *  输入： [2,5],[[3,0,5],[1,2,10]],[3,2]
 *  输出： 14
 *  解释：
 *      [2,5]表示有两种商品A,B，A单价2，B单价5
 *      [3,0,5]表示一种优惠，3A+0B需要花费5
 *      [1,2,10]表示另一种优惠，1A+2B需要花费10
 *      [3,2]表示你需要购买3A+2B
 *      结果14表示花费了10用第二种优惠1A+2B，然后花费4买了2A
 */
public class ShoppingOffers {
    private static int shoppingOffers(List<Integer> price,
                                      List<List<Integer>> special,
                                      List<Integer> needs){
        int n = price.size();
        int mincost = 0;
        for (int i = 0; i < n; i++) {
            mincost += price.get(i) * needs.get(i);
        }
        int m = special.size();

        for (int i = 0; i < m; i++) {
            boolean isValid = true;
            List<Integer> offer = special.get(i);
            for (int j = 0; j < n; j++) {
                int remain = needs.get(j) - offer.get(j);
                if(remain < 0){
                    isValid = false;
                }
                needs.set(j, remain); // 使用某一优惠后剩余多少
            }
            if(isValid){
                // 优惠可以重复使用
                mincost = Math.min(mincost,
                        shoppingOffers(price, special, needs)+offer.get(n));
            }
            for (int j = 0; j < n; j++) {
                needs.set(j, needs.get(j)+offer.get(j));
            }
        }
        return mincost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            List<Integer> price = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                price.add(in.nextInt());
            }
            int m = in.nextInt();
            List<List<Integer>> special = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                List<Integer> offer = new ArrayList<>();
                for (int j = 0; j < n+1; j++) {
                    offer.add(in.nextInt());
                }
                special.add(offer);
            }
            List<Integer> needs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                needs.add(in.nextInt());
            }
            System.out.println(shoppingOffers(price, special, needs));

        }
    }
}
