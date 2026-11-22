class Solution {
    public long minCost(int[] nums) {
        int l = 0; 
        int n = nums.length; 
        long ans = Long.MAX_VALUE; 
        while(l < n) {
            int r = l + 1; 
            while(r < n && nums[r] == nums[l]) r++;  
            if(r > 1 && l < n - 1) {
                long cost = 1L * nums[l] *1L* l + 1L * nums[l] *1L* (n - r); 
                ans = Math.min(ans, cost); 
            }
            l = r; 
        }
        return ans; 
    }
}