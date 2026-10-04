class Solution {
    public boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()][s.length() + 1];
        return fun(s, 0, 0, dp);
    }

    boolean fun(String s, int i, int count, Boolean[][] dp) {

        if (count < 0) return false;

        if (i == s.length()) {
            return count == 0;
        }

        if (dp[i][count] != null) {
            return dp[i][count];
        }

        boolean ans;

        if (s.charAt(i) == '*') {

            // * = empty
            // * = (
            // * = )
            ans = fun(s, i + 1, count, dp)
               || fun(s, i + 1, count + 1, dp)
               || fun(s, i + 1, count - 1, dp);

        } else if (s.charAt(i) == '(') {

            ans = fun(s, i + 1, count + 1, dp);

        } else {

            ans = fun(s, i + 1, count - 1, dp);
        }

        return dp[i][count] = ans;
    }
}