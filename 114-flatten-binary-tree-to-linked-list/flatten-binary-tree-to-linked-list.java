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
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        fun(root, st);
        TreeNode temp = null;
        System.out.print(st.size());
        while(st.size()!=0) {
            st.peek().right = temp;
            temp = st.pop();
            temp.left = null;
        }
    }
    void fun(TreeNode root, Stack<TreeNode> st) {
        if(root==null) return ;
        st.push(root);
        fun(root.left,st);
        fun(root.right, st);
    }
}