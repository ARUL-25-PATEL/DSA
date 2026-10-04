class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;

        int sum = 0;

        // Initial sum of even numbers
        for (int x : nums) {
            if (x % 2 == 0) {
                sum += x;
            }
        }

        int[] answer = new int[m];

        for (int i = 0; i < m; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];

            if (nums[idx] % 2 == 0) {
                if (val % 2 == 0) {
                    sum += val;
                } else {
                    sum -= nums[idx];
                }
            } else {
                if (val % 2 != 0) {
                    sum += nums[idx] + val;
                }
            }

            nums[idx] += val;

            answer[i] = sum;
        }

        return answer;
    }
}