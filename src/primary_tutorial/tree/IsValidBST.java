package primary_tutorial.tree;

import java.util.Scanner;

/**
 * 验证是否是有效的二叉搜索树
 */
public class IsValidBST {

    static boolean isValidBST(TreeNode root){
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        boolean left = true;
        boolean right = true;

        if(root.left != null){

            left = root.val > root.left.val && isValidBST(root.left);
        }

        if(root.right != null){
            right = root.right.val > root.val && isValidBST(root.right);
        }

        return left && right;

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
            boolean result = isValidBST(root);
            if(result)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
