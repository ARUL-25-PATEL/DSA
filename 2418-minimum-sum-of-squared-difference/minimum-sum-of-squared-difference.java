class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int feq[]  = new int[100001];
        for(int i = 0;i<nums1.length;i++) feq[Math.abs(nums1[i]-nums2[i])]++;
        int k = k1+k2;
        for(int i = 100000;i>0 && k!=0 ;i--) {
            if(feq[i]==0) continue;
            int n = Math.min(k,feq[i]);
            k-=n;
            feq[i]-=n;
            feq[i-1]+=n;
        }
        long ans =0;
        for(int i = 0;i<100001;i++)ans += (long) feq[i] * i * i;
        return ans; 
    }
}