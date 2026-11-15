class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int m = (int) 1e9+7;
        for(int i = 1;i<n;i++){
            arr[i] += arr[i-1];
        }
        int ans = 0,even=1,odd=0;
        for(int i = 0;i<n;i++){
            if(arr[i]%2==0) {
                ans=(odd+ans)%m;
                even++;
            }
            else{
                ans = (even+ans)%m;
                odd++;
             }
        }
        return ans;
    }
}