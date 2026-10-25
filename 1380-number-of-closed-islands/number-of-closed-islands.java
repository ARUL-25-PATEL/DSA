class Solution {
    public int closedIsland(int[][] g) {
        int n = g.length,m= g[0].length,count=0;
        boolean seen[][]= new boolean[n][m];
        for(int i = 0;i<n;i++) for(int j = 0;j<m;j++) if(g[i][j]==0 && !seen[i][j]) if(fun(g,i,j,n,m,seen)) count++;
        return count;
    }
    boolean fun(int[][] g, int i, int j, int n , int m, boolean seen[][]){
        if((i==0 || j==0 || i==n-1 || j==m-1) && g[i][j]==0) {
            return false;
        }
        if(g[i][j]==1 || seen[i][j]) return true;
        seen[i][j] = true;
         boolean down  = fun(g, i + 1, j, n, m,seen);
        boolean right = fun(g, i, j + 1, n, m,seen);
        boolean up    = fun(g, i - 1, j, n, m,seen);
        boolean left  = fun(g, i, j - 1, n, m,seen);

        return down && right && up && left;
    }
}