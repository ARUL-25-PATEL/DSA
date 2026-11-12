class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int count1=1,count2=1,maxCount1=0,maxCount2=0;
        for(int i = 0;i<n-1;i++){
            if(nums[i]>nums[i+1]) count1++;
            else {
                maxCount1 = Math.max(maxCount1,count1);
                count1 = 1;
            }

            if(nums[i]<nums[i+1]) count2++;
            else {
                maxCount2 = Math.max(maxCount2,count2);
                count2 = 1;
            }
        }
        maxCount1 = Math.max(maxCount1,count1);
        maxCount2 = Math.max(maxCount2,count2);
        return Math.max(maxCount1,maxCount2);
    }
}