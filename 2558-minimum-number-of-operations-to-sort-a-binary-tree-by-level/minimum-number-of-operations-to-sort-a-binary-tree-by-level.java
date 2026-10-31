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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(q.size()!=0){
            int n = q.size();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                TreeNode x = q.poll();
                arr[i] = x.val;
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
            int idx = -1;
            for(int i = 0;i<n;i++){
                idx = i;
                for(int j = i+1;j<n;j++) {
                    if(arr[idx]>arr[j]) idx = j;
                }
                if(idx!=i) {
                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
                    ans++;
                }
            }
        }
        return ans;
    }
}