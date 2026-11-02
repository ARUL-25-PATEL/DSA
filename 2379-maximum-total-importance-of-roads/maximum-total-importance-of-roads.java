class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        int[] degree = new int[n+1];

        for(int[] road : roads) {
            int u = road[0];
            int v = road[1];
            degree[u]++;
            degree[v]++;
        }

        Arrays.sort(degree);
        long sum = 0;
        
        for(int i=1; i<=n; i++) {
            sum += (degree[i] * (i * 1L));
        }

        return sum;


    }
}