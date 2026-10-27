class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        
        for (char[] row : grid)
            Arrays.fill(row, '#');
            
        int r = 0, c = 0;
        grid[r][c] = '.';
        
        while(r<m){
            grid[r][0] = '.';
            r++;
        }
        while(c<n){
            grid[m-1][c] = '.';
            c++;
        }
        
        String[] res = new String[m];
        
        for (int i = 0; i < m; i++)
            res[i] = new String(grid[i]);
            
        return res;
    }
}