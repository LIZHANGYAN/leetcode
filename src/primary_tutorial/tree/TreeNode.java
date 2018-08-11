package primary_tutorial.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        this.val = x;
    }

    static int counter = 0;
    static TreeNode createBT(int[] array, int i){
       if(i < array.length){
           if(array[i] == 0 && i != 0)
               return null;
           TreeNode root = new TreeNode(array[i]);
           root.left = createBT(array, ++counter);
           root.right = createBT(array, ++counter);
           return root;
       }
        return null;
    }

}
