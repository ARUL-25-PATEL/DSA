class Solution {
    public long maximumTotalSum(int[] m) {
        Arrays.sort(m);
        int n = m.length;
        long sum = m[n-1],last=sum;
        for(int i = n-2;i>=0;i--) {
            int x = m[i];
            if(last<=x) sum += --last;
            else sum+=x;
            last = Math.min(x,last);
            if(last<1) return -1;
        }
        return sum;
    }
}