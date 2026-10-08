class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length,op=0;
        Stack<el> st = new Stack<>();
        for(int i = 0;i<n;i++){
            if(st.isEmpty()) st.push(new el(nums[i],i));
            else{
                el temp = st.peek();
                if(temp.val==nums[i]){
                    if(temp.idx%2!=0) st.push(new el(nums[i],temp.idx+1));
                }else st.push(new el(nums[i],temp.idx+1));
            }
        }
            return st.size()%2==0 ? n-st.size() : n-st.size()+1;
    }
    class el{
        int val;
        int idx;
        el(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}