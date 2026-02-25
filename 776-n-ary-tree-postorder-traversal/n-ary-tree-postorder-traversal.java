class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        traverse(root, result);
        return result;
    }
    
    private void traverse(Node node, List<Integer> result) {
        // First, visit all children
        for (Node child : node.children) {
            traverse(child, result);
        }
        // Then, visit the node itself
        result.add(node.val);
    }
}