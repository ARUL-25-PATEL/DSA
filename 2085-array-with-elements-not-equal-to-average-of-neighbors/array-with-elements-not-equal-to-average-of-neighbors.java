class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,idx=n-1;
        int ans[] = new int[n];
        for(int i = 0;i<n;i+=2) ans[i] = nums[idx--];
        for(int i = 1;i<n;i+=2) ans[i] = nums[idx--];
        return ans;
    }
}