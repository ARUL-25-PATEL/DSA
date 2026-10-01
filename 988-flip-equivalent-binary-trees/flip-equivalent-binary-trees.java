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
    public boolean flipEquiv(TreeNode r1, TreeNode r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null || r1.val!=r2.val) return false;
        if( (r1.left !=null && r2.right!=null && r1.left.val == r2.right.val) || r1.left ==null && r2.right ==null || r1.right ==null && r2.left ==null  ) {
            TreeNode temp = r1.left;
            r1.left = r1.right;
            r1.right = temp;
        }
        // if(r1.left ==null && r2.right !=null || r1.right ==null && r2.left !=null  )
        return flipEquiv( r1.left,  r2.left) &&  flipEquiv( r1.right,  r2.right);

    }
}