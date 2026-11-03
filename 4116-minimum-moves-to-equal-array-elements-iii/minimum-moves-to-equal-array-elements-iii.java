class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i : nums) max = Math.max(max,i);
        int count = 0;
        for(int i:nums) count +=max-i;
        return count;
    }
}