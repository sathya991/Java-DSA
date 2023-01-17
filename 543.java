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
    public int diameterOfBinaryTree(TreeNode tree) {
      int countMax = 0;
    if(tree == null) return countMax;
    int left = countTotal(tree.left,0);

    int right = countTotal(tree.right,0);

    if(left+right > countMax) countMax = left+right;

   int a = diameterOfBinaryTree(tree.left);
   int b = diameterOfBinaryTree(tree.right);
    countMax = Math.max(countMax,Math.max(a,b));
    return countMax;
  }
  public int countTotal(TreeNode tree,int count){
    if(tree == null) return count;
    int a = countTotal(tree.left,count+1);
    int b = countTotal(tree.right,count+1);
    return Math.max(a,b);
  }
}