class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0,n=nums.length,num = nums[n/2];
        for(int i : nums) ans += Math.abs(i-num);
        return ans;
    }
}