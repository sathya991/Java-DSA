/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root != null){
            int left = checkDepth(root.left,0);
            int right = checkDepth(root.right,0);
            if(Math.abs(left - right) > 1) return false;
        }
        boolean a = true;
        boolean b = true;
        if(root != null){
        a = isBalanced(root.left);
        b = isBalanced(root.right);
        }
        return a && b;
    }
   public int checkDepth(TreeNode root,int depth){
       int a = -1;
       int b = -1;
        if(root == null) return depth;
           a = checkDepth(root.left,depth+1);
           b = checkDepth(root.right,depth+1);
        return Math.max(a,b);
    }
}