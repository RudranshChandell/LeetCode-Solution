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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return null;

        Map<TreeNode,TreeNode>parentNode=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);

        ArrayList<TreeNode> deepestNode=new ArrayList<>();

        while(!q.isEmpty()){
            int size=q.size();
            deepestNode= new ArrayList<>();

            for(int i=0;i<size;i++){            
                TreeNode curr= q.poll();
                deepestNode.add(curr);
                
                if(curr.left!=null){
                    q.offer(curr.left);
                    parentNode.put(curr.left,curr);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    parentNode.put(curr.right,curr);
                }
            }
        }

        Set<TreeNode>set=new HashSet<>(deepestNode);

        while(set.size()>1){
            Set<TreeNode>ans=new HashSet<>();

            for(TreeNode node : set){
                ans.add(parentNode.get(node));
            }

            set=ans;
        }

        return set.iterator().next();
    }
}