/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Map<Integer,Boolean> visitedList = new HashMap<>();
    TreeNode temp = root;
    TreeNode result = root;
        visitedList.put(root.val,true);
    while(temp != p){
        if(p.val < temp.val) temp = temp.left;
        else temp = temp.right;
        if (temp == null) break;
        visitedList.put(temp.val,true);
    }
    temp = root;
    while(temp != q.left && temp != q.right){
        System.out.println(visitedList);
        if(visitedList.getOrDefault(temp.val,false)) result = temp;
        if(q.val < temp.val) temp = temp.left;
        else temp = temp.right;
    }
    return result;
    }
}