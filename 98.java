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
    public boolean isValidBST(TreeNode root) {
      return validate(root,null,null);
    }
    public boolean validate(TreeNode tree,Integer min,Integer max){
    if(tree == null) return true;
    if((min != null && tree.val <= min) || (max != null && tree.val >= max)) return false;
    boolean left = validate(tree.left,min,tree.val);
    boolean right = validate(tree.right,tree.val,max);
    return left && right;
  }

}