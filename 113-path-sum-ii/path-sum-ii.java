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

    public List<List<Integer>> pathSum(TreeNode root, int tsum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        helper(ans, temp, root, tsum);

        return ans;
    }

    void helper(List<List<Integer>> ans, ArrayList<Integer> temp,
            TreeNode root, int tsum) {

        if (root == null)
            return;

        temp.add(root.val);
        tsum -= root.val;

        if (root.left == null && root.right == null) {

            if (tsum == 0) {
                ans.add(new ArrayList<>(temp));
            }

            temp.removeLast(); 
            return;
        }

        helper(ans, temp, root.left, tsum);
        helper(ans, temp, root.right, tsum);

        temp.removeLast(); 
    }
}