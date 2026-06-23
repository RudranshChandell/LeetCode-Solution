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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Deque<Integer>q=new ArrayDeque<>();
        for(int val:preorder){
            q.offer(val);
        }
        return build(q,inorder);        
    }
    public TreeNode build(Deque <Integer>q,int[]inorder){
        if(inorder.length>0){
            int index=findIndex(inorder,q.peek());

            TreeNode root=new TreeNode(q.poll());

            root.left=build(q,Arrays.copyOfRange(inorder,0,index));
            root.right=build(q,Arrays.copyOfRange(inorder,index+1,inorder.length));

            return root;
        }
        return null;
    }

    public int findIndex(int[]inorder,int num){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==num) return i;
        }
        return -1;
    }
}