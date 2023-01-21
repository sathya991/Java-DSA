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
    public List<Integer> postorderTraversal(TreeNode root) {
        return postOrderTraverse(root,new ArrayList<Integer>());
    }
    public List<Integer> postOrderTraverse(TreeNode tree, List<Integer> array) {
    if (tree == null) return array;
    postOrderTraverse(tree.left,array);
    postOrderTraverse(tree.right,array);
    array.add(tree.val);
    return array;
  }
}