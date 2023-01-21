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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode newNode = new TreeNode(preorder[0]);
    TreeNode root = newNode;
    int[] i = {1};
    preOrder(newNode,preorder,i,Integer.MIN_VALUE,Integer.MAX_VALUE);
    return root;
  }
  public void preOrder(TreeNode node,int[] values,int[] i,int min,int max){
    if(i[0] == values.length) return;
    int val = values[i[0]];
    if(val < node.val && val >= min && val < max){
      TreeNode newNode = new TreeNode(val);
      node.left = newNode;
      i[0]++;
      preOrder(newNode,values,i,min,node.val);
    }
    if(i[0] >= values.length) return;
    val = values[i[0]];  
    if(val >= node.val && val >= min && val < max){
      TreeNode newNode = new TreeNode(val);
      node.right = newNode;
      i[0]++;
        preOrder(newNode,values,i,node.val,max);
    }
    if(val < min || val > max )return;
  }
}