class Solution {
    int n;
    int[] copies;
    int cheapestItem;
    int[][] dp;

    public int solve(int i, int budget, int[][] items) {
        if (i == n)
            return budget / cheapestItem;

        if (dp[i][budget] != -1)
            return dp[i][budget];

        int buy = 0;
        int price = items[i][1];

        if (budget >= price) {
            buy = 1 + copies[i] + solve(i + 1, budget - price, items);
        }

        int skip = solve(i + 1, budget, items);

        return dp[i][budget] = Math.max(buy, skip);
    }

    public int maximumSaleItems(int[][] items, int budget) {
        this.n = items.length;
        this.copies = new int[n];
        this.cheapestItem = 1501;

        for (int i = 0; i < n; i++) {
            cheapestItem = Math.min(cheapestItem, items[i][1]);

            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    copies[i]++;
                }
            }
        }

        dp = new int[n + 1][budget + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(0, budget, items);
    }
}