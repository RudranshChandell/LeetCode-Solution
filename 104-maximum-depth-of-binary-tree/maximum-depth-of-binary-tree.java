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
    int maxCount=0;
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        count(root,1);
        return maxCount;
    }
    public void count(TreeNode root,int count){
        if(root==null) return ;
        maxCount=Math.max(count,maxCount);
        count(root.left,count+1);
        count(root.right,count+1);

    }
}