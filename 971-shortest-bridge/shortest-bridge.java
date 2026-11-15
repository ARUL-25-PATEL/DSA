class Solution {
    public int shortestBridge(int[][] g) {
        int n = g.length, m =g[0].length;
        boolean flag = false;
        for(int i = 0;i<n && !flag ;i++) {
            for(int j = 0;j<m;j++) if(g[i][j]==1) {
            dfs(g,i,j);
            flag = true;
            break;
        }
        }
        ArrayList<ArrayList<Integer>> two = new ArrayList<>();
        ArrayList<ArrayList<Integer>> one = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(g[i][j]==2) {
                   two.add(new ArrayList<Integer>());
                   two.get(two.size()-1).add(i);
                   two.get(two.size()-1).add(j);
                }else if(g[i][j]==1) {
                   one.add(new ArrayList<Integer>());
                   one.get(one.size()-1).add(i);
                   one.get(one.size()-1).add(j);
                }
            }
        }
        int ans = 100000;
        for(ArrayList<Integer> x : two) for(ArrayList<Integer> y : one) {
            int dis  = Math.abs(x.get(0)-y.get(0)) + Math.abs(x.get(1)-y.get(1));
            ans = Math.min(ans,dis); 
        }
        return ans-1;
    }
    void dfs(int g[][], int i, int j) {
        if(i<0 || i==g.length || j==g[0].length ||j<0 || g[i][j]==0 || g[i][j]==2  ) return;
        g[i][j] = 2;
        dfs(g,i+1,j);
        dfs(g,i,j+1);
        dfs(g,i,j-1);
        dfs(g,i-1,j);
    }
    
}