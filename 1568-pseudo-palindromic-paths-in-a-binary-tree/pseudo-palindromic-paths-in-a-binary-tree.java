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
    public int pseudoPalindromicPaths (TreeNode root) {
        int feq[] = new int[10];
        return fun(root,feq);
    }
    int fun(TreeNode root, int feq[]){
        if(root==null) return 0;
        feq[root.val]++;
        if(root.left==null && root.right==null) {
            int odd = 0;
            for(int i : feq) if(i%2!=0) odd++;
            feq[root.val]--;
            return odd>1 ? 0:1;
        }
        int left = fun(root.left, feq);
        int right = fun(root.right, feq);
        feq[root.val]--;
        return left+right;
    }
}