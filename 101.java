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
    public boolean isSymmetric(TreeNode tree) {   
      TreeNode leftTree = tree.left;
      TreeNode rightTree = tree.right;
    return check(leftTree,rightTree);
  }
  boolean check(TreeNode leftTree,TreeNode rightTree){
    if(leftTree != null && rightTree != null){
        if(leftTree.val != rightTree.val || leftTree.val != rightTree.val) return false;
    }
    if(leftTree == null && rightTree != null || leftTree != null && rightTree == null){
      return false;
    }
    if(leftTree == null && rightTree == null){
      return true;
    }
    return check(leftTree.left,rightTree.right) && check(leftTree.right,rightTree.left);
  }
}