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
    List<List<Integer>>ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.ans=new ArrayList<>();
        if(root==null) return ans;

        dfs(root,targetSum,new ArrayList<>(),0);
        return ans;
    }

    public void dfs(TreeNode root,int target,ArrayList<Integer>list,int sum){
        if(root==null )return;

        sum+=root.val;
        list.add(root.val);

        if(root.left==null && root.right==null){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
        }else{
            dfs(root.left,target,list, sum);
            dfs(root.right,target,list, sum);
            
        }
        list.remove(list.size()-1);
    }
}