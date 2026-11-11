/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
       dfs(root);
       dfs2(root.left, root.right);
       return root;
    }
    void dfs(Node root){
        if(root==null || root.left==null) return ;
        root.left.next = root.right;
        connect( root.left);
        connect( root.right);
    }
    void dfs2(Node root1, Node root2){
        if(root1==null) return;
        root1.next = root2;
        dfs2(root1.right, root2.left);
    }

}