class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1;j++){
                if(nums[j]>nums[j+1] && Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])) {
                    int x = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] =x;
                }
            }
        }
        for(int i = 0;i<n-1;i++) if(nums[i]>nums[i+1]) return false;
        return true;
    }
}