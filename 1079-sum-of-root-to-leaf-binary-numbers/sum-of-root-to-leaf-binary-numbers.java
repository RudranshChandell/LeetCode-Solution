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
    int maxSum=0;
    public int sumRootToLeaf(TreeNode root) {
        sum(root,0);
        return maxSum;
    }

    public void sum(TreeNode root,int currentSum){
        if(root==null) {
            return;
        }

        currentSum=(currentSum<<1)|root.val;

        if(root.left==null && root.right==null){    
            maxSum+=currentSum;
            return;
        }

        sum(root.left,currentSum);
        sum(root.right,currentSum);
    }
}