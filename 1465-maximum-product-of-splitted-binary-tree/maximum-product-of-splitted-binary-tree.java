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
    long maxProduct=0;
    long totalSum=0;
    public int maxProduct(TreeNode root) {
        totalSum=findTotal(root);

        findMax(root);

        return (int) (maxProduct % 1000000007);
    }

    public long findMax(TreeNode root){
        if(root==null) return 0;

        long currentSum=root.val+ findMax(root.left)+ findMax(root.right);
        
        long remainingSum=totalSum-currentSum;
        long product= currentSum*remainingSum;

        maxProduct= Math.max(maxProduct, product);

        return currentSum;
    }

    public int findTotal(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val + findTotal(root.left)+ findTotal(root.right);
    }
}