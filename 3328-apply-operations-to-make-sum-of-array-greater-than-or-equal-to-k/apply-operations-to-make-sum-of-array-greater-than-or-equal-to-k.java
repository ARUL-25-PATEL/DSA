class Solution {
    public int minOperations(int k) {
        k--;
        if(k==0 || k==1) return k;
        int i = 1,ans =1000000,temp=k;
        while(temp!=0) {
            int sum = i-1 + k/i;
            ans = Math.min(sum,ans);
            temp--;
            i++;
        }
        return ans;

    }
}