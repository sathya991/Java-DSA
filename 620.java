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
    public TreeNode mergeTrees(TreeNode tree1, TreeNode tree2) {
    if(tree1 == null && tree2 == null) return tree1;
    if(tree1 == null){
      tree1 = new TreeNode(tree2.val);
    }
    else if(tree1 != null && tree2 != null){
      tree1.val += tree2.val;
    }
    else{
        tree2 = new TreeNode(0);
    }
    if(tree1.left == null && tree2.left != null){
      tree1.left = new TreeNode(0);
    }
    if(tree1.right == null && tree2.right != null){
      tree1.right = new TreeNode(0);
    }
     if(tree1.left != null && tree2.left == null){
      tree2.left = new TreeNode(0);
    }
    if(tree1.right != null && tree2.right == null){
      tree2.right = new TreeNode(0);
    }
    mergeTrees(tree1.left,tree2.left);
    mergeTrees(tree1.right,tree2.right);
    return tree1;
    }
}