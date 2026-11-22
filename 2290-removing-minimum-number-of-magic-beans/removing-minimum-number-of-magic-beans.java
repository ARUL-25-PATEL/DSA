class Solution {
    public long minimumRemoval(int[] b) {
        Arrays.sort(b);
        int n = b.length,i=0,j=0;
        long sumr = 0,suml=0,ans=Long.MAX_VALUE;
        for(int p : b) sumr+=p;
        while(i<n){
            j = i;
            while(j<n && b[i]==b[j]) j++;
            long sumx = (j-i) *(long) b[i];
            sumr -= sumx;
            long rem  = (n-j)*(long)b[i];
            ans = Math.min(ans,sumr+suml-rem);
            suml += sumx;
            i = j; 
        }
        return ans;
    }
}