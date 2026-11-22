class Solution {
    public long makeIntegerBeautiful(long n, int t) {
        if(n==t) return 0;
        long itr = 0,base=10;
        while(fun(n+itr)>t) {
            long x = n%base;
            itr = base-x;
            base*=10;
        }
        return itr;
    }
    long fun(long x) {
        long sum = 0;
        while(x!=0) {
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
}