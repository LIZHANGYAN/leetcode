package primary_tutorial.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 给定两个数组，写一个方法计算交集
 */
public class InterSetOf2Arrays {

    private static int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length == 0 || nums2.length == 0)
            return null;


        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> tmp = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums2[j] > nums1[i])
                i++;
            else if(nums2[j] < nums1[i])
                j++;
            else{
                tmp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[tmp.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = tmp.get(k);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n1 = in.nextInt();
            int[] a1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                a1[i] = in.nextInt();
            }

            int n2 = in.nextInt();
            int[] a2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                a2[i] = in.nextInt();
            }
            int[] result = intersect(a1, a2);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }
    }
}
