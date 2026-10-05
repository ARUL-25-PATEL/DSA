class Solution {
    public int closedIsland(int[][] g) {
        int n = g.length,m= g[0].length,count=0;
        for(int i = 1;i<n-1;i++) for(int j = 1;j<m-1;j++) if(g[i][j]==0) if(fun(g,i,j,n,m)) count++;
        return count;
    }
    boolean fun(int[][] g, int i, int j, int n , int m){
        if((i==0 || j==0 || i==n-1 || j==m-1) && g[i][j]==0) {
            g[i][j]=1;
            return false;
        }
        if(g[i][j]==1) return true;
        g[i][j] = 1;
        boolean down  = fun(g, i + 1, j, n, m);
        boolean right = fun(g, i, j + 1, n, m);
        boolean up    = fun(g, i - 1, j, n, m);
        boolean left  = fun(g, i, j - 1, n, m);

        return down && right && up && left;
    }
}