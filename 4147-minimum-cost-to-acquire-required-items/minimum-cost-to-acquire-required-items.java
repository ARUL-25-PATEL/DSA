class Solution {
    public long minimumCost(int c1, int c2, int cb, int n1, int n2) {
        long case1 = c1*(long)n1 + c2*(long)n2;
        long case2 = Math.max(n1,n2) * (long) cb;
        long case3 = Long.MAX_VALUE,case4 = Long.MAX_VALUE;
        if(n1>n2) case3 = (n1-n2)*(long) c1 + n2*(long) cb;
        else case4 = (n2-n1)*(long) c2 + n1*(long) cb;
        return Math.min(Math.min(case1,case2),Math.min(case3,case4));
    }
}