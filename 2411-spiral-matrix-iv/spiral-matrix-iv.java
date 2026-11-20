class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        for(int i = 0; i < m; i++)
            Arrays.fill(mat[i], -1);

        int top = 0, bottom = m-1, left = 0, right = n-1;
        ListNode t = head;

        while(top <= bottom && left <= right && t != null) {
            for(int i = left; i <= right && t != null; i++) {
                mat[top][i] = t.val;
                t = t.next;
            }
            top++;

            for(int i = top; i <= bottom && t != null; i++) {
                mat[i][right] = t.val;
                t = t.next;
            }
            right--;

            for(int i = right; i >= left && t != null; i--) {
                mat[bottom][i] = t.val;
                t = t.next;
            }
            bottom--;

            for(int i = bottom; i >= top && t != null; i--) {
                mat[i][left] = t.val;
                t = t.next;
            }
            left++;
        }

        return mat;
    }
}