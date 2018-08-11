package primary_tutorial.tree;

import java.util.Scanner;

/**
 * 二叉树的最大深度
 */
public class FindMaxDepthBT {

    static int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        int ldepth = maxDepth(root.left) + 1;
        int rdepth = maxDepth(root.right) + 1;
        return ldepth<rdepth?rdepth:ldepth;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

            TreeNode.counter = 0;
            TreeNode root = TreeNode.createBT(array, 0);
            System.out.println(maxDepth(root));
        }
    }
}
