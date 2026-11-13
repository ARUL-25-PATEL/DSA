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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode t = head;
        if(t==null) return null;
        ArrayList<Integer> l = new ArrayList<>();
        while(t!=null) {
            l.add(t.val);
            t = t.next;
        }
        int n = l.size();
        return fun(l, 0, n-1);
    }
    TreeNode fun(ArrayList<Integer> l , int i, int j){
        if(j<i) return null;
        if(i==j) return new TreeNode(l.get(i));
        int idx = (j-i)/2+i;
        TreeNode root = new TreeNode(l.get(idx));
        TreeNode left = fun(l,i,idx-1);
        TreeNode right = fun(l,idx+1,j);
        root.left = left;
        root.right = right;
        return root;
    }
}