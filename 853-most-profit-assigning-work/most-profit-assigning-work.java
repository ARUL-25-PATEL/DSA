class Solution {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        int n  = d.length,max=0;
        int dp[][] = new int[n][2];
        for(int i = 0;i<n;i++) {
            dp[i][0] = p[i];
            dp[i][1] = d[i];
            max = Math.max(max,d[i]);
        }
        int x[]  = new int[max+1];
        Arrays.sort(dp, (a,b)->b[0]-a[0]);
        for(int i = 0;i<n;i++){
            int idx = dp[i][1];
            for(int r = idx;r<=max;r++){
                if(x[r]!=0) break;
                x[r] = dp[i][0];
            }
        }
        int count = 0;
        for(int i : w) count += i>max ? x[max] : x[i];
        return count;
    }
}