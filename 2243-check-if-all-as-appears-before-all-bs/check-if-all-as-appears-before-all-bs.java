class Solution {
    public boolean checkString(String s) {
        int n = s.length(), a = -1,b=-1;
        for(int i = 0;i<n;i++) {
            if(s.charAt(i)=='a') a=i;
            else if(b==-1)b=i;
        }
        if(a==-1 || b==-1) return true;
        if(b<a) return false;
        return true;
    }
}