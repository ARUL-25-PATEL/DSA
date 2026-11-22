class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        int i = n-1;
        while(k!=0){
            k--;
            if(mul>1) sum += (long)mul*nums[i];
            else sum += nums[i];
            i--;
            mul--;
        }
        return sum;
    }
}