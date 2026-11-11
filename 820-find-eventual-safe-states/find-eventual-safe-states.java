class Solution {
    public List<Integer> eventualSafeNodes(int[][] g) {
        int n = g.length;
        Boolean dp[]  = new Boolean[n];
        for(int i = 0;i<n;i++) {
            boolean seen[] = new boolean[n];
            if(dp[i]==null) dp[i] = dfs(g,dp,i,seen);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++) if(dp[i]==true) ans.add(i);
        return ans; 
    }
    boolean dfs(int[][] g, Boolean dp[], int i, boolean seen[]){
            if(g[i].length==0) return dp[i] = true;   
            if(seen[i]) return !seen[i];
            if(dp[i]!=null) return dp[i];
            seen[i] = true;
            dp[i] = true;
            for(int x : g[i]) {
                dp[i] = dp[i] && dfs(g,dp,x,seen);
            }
            seen[i] = false;
            return dp[i];
           
        }
}