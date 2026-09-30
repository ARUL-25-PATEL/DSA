class Solution {
    public int findMaxFish(int[][] g) {
        int n = g.length,m=g[0].length,count=0;
        boolean v[][] = new boolean[n][m];
        for(int i = 0;i<n;i++) for(int j = 0;j<m;j++) if(!v[i][j] && g[i][j]!=0) count =Math.max(count, dfs(g,v,i,j,n,m));
        return count;
    }
    int dfs(int [][] g, boolean[][] v, int i , int j,int n , int m ){
        int left = 0,right = 0,up = 0,down = 0;
        v[i][j] = true;
        if(j-1>=0 && g[i][j-1]!=0 && !v[i][j-1]) {
            // v[i][j-1] = true;
            left = dfs(g,v,i,j-1,n,m);
        }
         if(i-1>=0 && g[i-1][j]!=0 && !v[i-1][j]) {
            // v[i-1][j] = true;
            up = dfs(g,v,i-1,j,n,m);
        }
         if(j+1<m && g[i][j+1]!=0 && !v[i][j+1]) {
            // v[i][j] = true;
            right = dfs(g,v,i,j+1,n,m);
        }
         if(i+1<n && g[i+1][j]!=0 && !v[i+1][j]) {
            // v[i+1][j] = true;
            down = dfs(g,v,i+1,j,n,m);
        }
        return g[i][j]+left+right+up+down;
    }
}