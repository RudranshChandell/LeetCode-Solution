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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            int max=-101;

            for(int i=0;i<n;i++){
                TreeNode current=q.poll();
                max=current.val;
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            ans.add(max);
        }
        return ans;
    }
}