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
    List<Integer>list=new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        return createBST(0,list.size()-1);
    }

    public  void inorder(TreeNode node){
        if(node==null) return;
        
        inorder(node.left);

        list.add(node.val);

        inorder(node.right);
    }

    public TreeNode createBST(int left,int right){
        if(left>right) return null;

        int mid=(left+right)>>1;

        TreeNode leftSubTree=createBST(left,mid-1);
        
        TreeNode rightSubTree=createBST(mid+1,right);

        return new TreeNode(list.get(mid),leftSubTree,rightSubTree);
    }
}