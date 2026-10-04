class Solution {
    public boolean checkValidString(String s) {
        byte dp[][] = new byte[101][101]; 
        return fun(s,0,0,dp);
    }
    boolean fun(String s, int i, int count, byte[][] dp){
        if(i==s.length() && count==0) return true;
        if(count<0 || i==s.length()) return false;
        if(dp[i][count]!=0) return dp[i][count] == 1;
        boolean ans = false;
        if(s.charAt(i)=='*') {
            ans =  fun(s,i+1,count, dp) || 
                    fun(s,i+1,count+1, dp )||
                    fun(s,i+1,count-1,dp);
        }else if (s.charAt(i) == '(') {

            ans = fun(s, i + 1, count + 1, dp);

        } else {

            ans = fun(s, i + 1, count - 1, dp);
        }
        dp[i][count] = (byte) (ans ? 1 : -1);
        return ans;

    }
}