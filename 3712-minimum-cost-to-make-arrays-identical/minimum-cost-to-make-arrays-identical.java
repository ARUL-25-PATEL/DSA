class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long n = arr.length,count1=0,count2=0;
        for(int i = 0;i<n;i++) count1+=Math.abs(arr[i]-brr[i]);
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i = 0;i<n;i++) count2 += Math.abs(arr[i]-brr[i]);
        return Math.min(count1,count2+k);
    }
}