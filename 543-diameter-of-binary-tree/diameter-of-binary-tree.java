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
    int ans=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return ans;
    }

    public int check(TreeNode node){
        if(node==null) return 0;

        int left=check(node.left);
        int right=check(node.right);

        ans=Math.max(ans,left+right);

        return Math.max(left,right)+1;
    }
}