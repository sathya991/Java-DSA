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
    public int kthSmallest(TreeNode root, int k) {
    List<Integer> inorderList = new ArrayList<>();
    inorder(root,inorderList);
    return inorderList.get(k-1);
  }
  public void inorder(TreeNode tree,List<Integer> l){
    if(tree == null) return;
    inorder(tree.left,l);
    l.add(tree.val);
    inorder(tree.right,l);
  }
}