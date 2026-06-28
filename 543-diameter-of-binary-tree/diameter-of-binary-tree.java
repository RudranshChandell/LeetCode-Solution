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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return ans;
    }

    public int check(TreeNode root){
        if(root==null) return 0;

        int left=check(root.left);
        int right=check(root.right);

        ans=Math.max(ans,left+right);

        return 1+ Math.max(left,right);
    }
}