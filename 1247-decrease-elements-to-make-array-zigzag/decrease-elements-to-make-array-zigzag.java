class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int arr1[] = nums.clone();
        int arr2[] = nums.clone();
        int odd = fun(arr1,true);
        int even = fun(arr2, false);
        // return odd;
        return Math.min(odd, even);
    }
    int fun(int[] nums, boolean flag){
        int n = nums.length,count=0;
        for(int i = 0;i<n;i++){
            if(flag){
                if(i%2==1) {
                    if(i-1>=0 && nums[i-1]>=nums[i]) {
                        count += nums[i-1]-nums[i]+1;
                        nums[i-1] = nums[i]-1;
                    }
                    if(i+1<n && nums[i+1]>=nums[i]){
                        count += nums[i+1]-nums[i]+1;
                        nums[i+1] = nums[i]-1;
                    } 
                }
            }else {
                if(i%2==0) {
                    if(i-1>=0 && nums[i-1]>=nums[i]){
                        count += nums[i-1]-nums[i]+1;
                        nums[i-1] = nums[i]-1; 
                    } 
                    if(i+1<n && nums[i+1]>=nums[i]) {
                        count += nums[i+1]-nums[i]+1;
                        nums[i+1] = nums[i]-1;
                    }
                }
            }
        }
        return count;
    }
}