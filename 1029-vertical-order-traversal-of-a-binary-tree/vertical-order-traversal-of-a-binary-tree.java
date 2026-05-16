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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        if(root==null) return result;

        Map<Integer,Map<Integer,ArrayList<Integer>>>map=new TreeMap<>();

        Queue<Trip>q=new LinkedList<>();
        q.add(new Trip(root,0,0));

        while(!q.isEmpty()){
            Trip trip=q.poll();

            TreeNode node=trip.node;
            int x=trip.x;
            int y=trip.y;

            map.computeIfAbsent(x,k->new TreeMap<>())
            .computeIfAbsent(y,k->new ArrayList<>())
            .add(node.val);

            if(node.left!=null)q.add(new Trip(node.left,x-1,y+1));
            if(node.right!=null)q.add(new Trip(node.right,x+1,y+1));
        }

        for(Map.Entry<Integer,Map<Integer,ArrayList<Integer>>>entry:map.entrySet()){
            List<Integer>list=new ArrayList<>();

            for(List<Integer>temp:entry.getValue().values()){
                Collections.sort(temp);
                list.addAll(temp);   
            }
            result.add(list);
        }
        return result;
    }
}
class Trip{
    TreeNode node;
    int x;
    int y;

    Trip(TreeNode node, int x, int y){
        this.node=node;
        this.x=x;
        this.y=y;
    }

}