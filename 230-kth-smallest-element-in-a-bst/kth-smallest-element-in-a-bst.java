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
    public int kthSmallest(TreeNode root, int k) {
        int idx[] = {0};
        int ans[] = {-1};
        fun(root, k, idx,ans);
        return ans[0];
    }
    void fun(TreeNode root, int k, int idx[], int ans[]){
        if(root==null) {
            return;
        }
        fun(root.left, k, idx, ans);
        idx[0]++;
        if(idx[0]==k){
            ans[0] = root.val;
            return;
        }
        fun(root.right, k, idx,ans);
        // idx[0]++;
        // if(idx[0]==k){
        //     ans[0] = root.val;
        //     return;
        // }
    }
}