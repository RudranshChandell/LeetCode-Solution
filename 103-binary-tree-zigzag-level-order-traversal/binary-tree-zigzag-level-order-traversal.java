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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        boolean con=true;
        List<List<Integer>>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            List<Integer>sublist=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sublist.add(node.val);
                
                if(node.left!=null) q.add(node.left); 
                if(node.right!=null) q.add(node.right); 
            }
            if(con==false) Collections.reverse(sublist);
            con=!con;
            list.add(sublist);
        }
        return list;
    }
}