/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node , Node>map=new HashMap<>();

    public Node cloneGraph(Node node) {
        return deepSearch(node);
    }

    public Node deepSearch(Node node){
        if(node==null) return null;

        Node cloneNode=map.get(node);

        if(cloneNode==null){
            cloneNode=new Node(node.val);
            map.put(node,cloneNode);
            for(Node neighbor:node.neighbors){
                cloneNode.neighbors.add(cloneGraph(neighbor));
            }
        }        
        return cloneNode;
    }
}