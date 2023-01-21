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
    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrderTraverse(root,new ArrayList<Integer>());
    }
    public List<Integer> preOrderTraverse(TreeNode tree, List<Integer> array) {
    if (tree == null) return array;
    array.add(tree.val);
    preOrderTraverse(tree.left,array);
    preOrderTraverse(tree.right,array);
    return array;
  }
}