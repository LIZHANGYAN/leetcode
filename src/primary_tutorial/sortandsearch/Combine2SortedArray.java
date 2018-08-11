package primary_tutorial.sortandsearch;

import java.util.Scanner;

/**
 * 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 */
public class Combine2SortedArray {


    static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int writeIdx = m+n-1;
        while(i >= 0 && j >= 0)
            nums1[writeIdx--] = nums1[i] > nums2[j]?nums1[i--]:nums2[j--];
        while(j >= 0)
            nums1[writeIdx--] = nums2[j--];


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int[] nums1 = new int[1000];
            for (int i = 0; i < m; i++) {
                nums1[i] = in.nextInt();
            }
            int n = in.nextInt();
            int[] nums2 = new int[n];
            for (int i = 0; i < n; i++) {
                nums2[i] = in.nextInt();
            }
            merge(nums1, m, nums2, n);
            for (int i = 0; i < m + n; i++) {
                System.out.print(nums1[i] + " ");
            }
        }
    }
}
