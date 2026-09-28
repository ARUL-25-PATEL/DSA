class Solution {
    public int maxDepth(String s) {
        int ans = 0,count=0;
        for(int i =0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='(') count++;
            else if(x==')') count--;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}