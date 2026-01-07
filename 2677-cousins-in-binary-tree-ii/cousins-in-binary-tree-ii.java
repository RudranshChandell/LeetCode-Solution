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
    public TreeNode replaceValueInTree(TreeNode root) {
        checkAndSum(root,0);

        root.val=0;

        replaceWithCousinSum(root,0);

        return root;
    }

    public void checkAndSum(TreeNode root , int depth){
        if(root==null) return;

        if(list.size()<=depth){
            list.add(0);
        }

        list.set(depth,list.get(depth)+root.val);

        checkAndSum(root.left,depth+1);
        checkAndSum(root.right,depth+1);
    }

    public void replaceWithCousinSum(TreeNode root,int depth){
        int leftNode=(root.left==null)?0:root.left.val;
        int rightNode=(root.right==null)?0:root.right.val;
        int sumBoth=leftNode+rightNode;
        
        depth++;

        if(root.left!=null){
            root.left.val=list.get(depth)-sumBoth;
            replaceWithCousinSum(root.left,depth);
        }
        
        if(root.right!=null){
            root.right.val=list.get(depth)-sumBoth;
            replaceWithCousinSum(root.right,depth);
        }
    }
}