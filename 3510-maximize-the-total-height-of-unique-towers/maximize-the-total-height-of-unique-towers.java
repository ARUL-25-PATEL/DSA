class Solution {
    public long maximumTotalSum(int[] m) {
        Arrays.sort(m);
        int n = m.length;
        long sum = m[n-1],last=sum;
        for(int i = n-2;i>=0;i--) {
            int x = m[i];
           if(m[i+1]<=x) m[i] = m[i+1]-1;
           sum += m[i];

        }
        if(m[0]<=0) return -1;
        return sum;
    }
}