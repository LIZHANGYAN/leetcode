package dp;

import java.util.Scanner;

/**
 * 打家劫舍
 *  你是一个专业的强盗，计划抢劫沿街的房屋。
 *  每间房都藏有一定的现金，
 *  阻止你抢劫他们的唯一的制约因素就是相邻的房屋有保安系统连接，
 *  如果两间相邻的房屋在同一晚上被闯入，它会自动联系警方。
 *  给定一个代表每个房屋的金额的非负整数列表，
 *  确定你可以在没有提醒警方的情况下抢劫的最高金额。
 */
public class HouseRobber {

    private static int rob(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int[] rt = new int[len];
        if(len == 1)
            return nums[0];
        if(len == 2)
            return nums[0]>nums[1]?nums[0]:nums[1];

        for (int i = 0; i < len; i++) {
            if(i==0){
                rt[i] = nums[i];
            }else if(i==1){
                rt[i] = Math.max(nums[i-1], nums[i]);
            }else{
                rt[i] = Math.max(rt[i-1], rt[i-2]+nums[i]);
            }
        }
        return rt[len-1] > rt[len-2]?rt[len-1]:rt[len-2];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] moneys = new int[n];
            for (int i = 0; i < n; i++) {
                moneys[i] = in.nextInt();
            }
            System.out.println(rob(moneys));
        }
    }
}
