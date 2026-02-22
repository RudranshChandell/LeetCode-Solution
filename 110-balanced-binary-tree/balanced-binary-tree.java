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
    public boolean isBalanced(TreeNode root) {
        return check(root)!=-1 ?true :false;
    }
    public int check(TreeNode node){
        if(node==null) return 0;

        int leftTree=check(node.left);
        int rightTree=check(node.right);

        if(leftTree==-1 || rightTree==-1 || Math.abs(leftTree-rightTree)>1){
            return -1;
        }
        
        return Math.max(leftTree,rightTree)+1;
    }
}