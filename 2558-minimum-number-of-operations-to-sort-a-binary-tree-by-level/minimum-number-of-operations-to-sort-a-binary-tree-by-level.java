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
        int ans = 0;
        while (q.size() != 0) {
            int n = q.size();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                TreeNode x = q.poll();
                arr[i] = x.val;
                if (x.left != null)
                    q.offer(x.left);
                if (x.right != null)
                    q.offer(x.right);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++)
                map.put(arr[i], i);
            int t[] = arr.clone();
            Arrays.sort(t);
            for (int i = 0; i < n; i++)
                if (arr[i] != t[i]) {
                    ans++;
                    int val1 = map.get(t[i]);
                    int val2 = map.get(arr[i]);
                    int temp = arr[val1];
                    arr[val1] = arr[val2];
                    arr[val2] = temp;
                    map.put(arr[val1], val1);
                    map.put(arr[i], i);
                }

        }
        return ans;
    }
}