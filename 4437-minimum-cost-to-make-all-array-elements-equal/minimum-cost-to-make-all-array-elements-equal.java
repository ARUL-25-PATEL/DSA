class Solution {
    public long minCost(int[] nums) {

        int n = nums.length;
        int l = 0;

        // Stores the minimum cost found so far
        long ans = Long.MAX_VALUE;

        // Traverse the array by consecutive groups
        while (l < n) {

            // Find the end of the current group
            int r = l + 1;

            // Extend the group while elements are equal
            while (r < n && nums[r] == nums[l]) {
                r++;
            }

            // The current group is [l, r-1]

            // We need a group that can cover the array
            // without violating the operation restrictions.
            if (r > 1 && l < n - 1) {

                // Cost to change elements on the left
                long leftCost = 1L * nums[l] * l;

                // Cost to change elements on the right
                long rightCost = 1L * nums[l] * (n - r);

                // Total cost for this group
                long cost = leftCost + rightCost;

                // Update the minimum cost
                ans = Math.min(ans, cost);
            }

            // Move to the next consecutive group
            l = r;
        }

        return ans;
    }
}