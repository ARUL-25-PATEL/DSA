/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        ListNode temp = head;
        boolean flag = false;
        if(root.val==temp.val) flag = dfs(temp, root);
        return flag || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    boolean dfs(ListNode temp, TreeNode root){
        if(temp == null) return true;
        if(root == null || root.val!=temp.val) return false;
        return dfs(temp.next,root.left) || dfs(temp.next, root.right);
    }
}