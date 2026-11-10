class Solution {
    public int climbStairs(int n, int[] c) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,100000000);
        return fun(n,0,c,dp);
    }
    int fun(int n, int i, int c[], int dp[]) {
        if(i==n) return 0;
        if(dp[i]!=100000000) return dp[i];
        int one = i+1<=n ? c[i] + 1+ fun(n,i+1,c,dp) : 1000000000;
        int two = i+2<=n ? c[i+1] + 4+ fun(n,i+2,c,dp) : 1000000000;
        int three = i+3<=n ? c[i+2] + 9+ fun(n,i+3,c,dp) : 1000000000;
        return dp[i] = Math.min(Math.min(one,two),three);
    }
}