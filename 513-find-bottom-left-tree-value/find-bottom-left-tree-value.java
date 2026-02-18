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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        List<Integer>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            list.clear();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                
                if(node.left!=null) q.add(node.left); 
                if(node.right!=null) q.add(node.right); 
            }
        }
        return list.get(0);
    }
}