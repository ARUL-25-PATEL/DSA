class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length, max = (n + 1) / 2, j = n - 1;
        long ans = 0;
        for (int i = 0; i < n; i++) nums[i] = nums[i] * nums[i];
        Arrays.sort(nums);
        while (max != 0) {
            ans += nums[j] ;
            j--;
            max--;
        }
        while (j >= 0) {
            ans -= nums[j];
            j--;
        }
        return ans;
    }
}