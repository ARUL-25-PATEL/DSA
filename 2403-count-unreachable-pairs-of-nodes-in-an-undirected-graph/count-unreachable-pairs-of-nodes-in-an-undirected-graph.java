class Solution {
    public long countPairs(int n, int[][] e) {
        boolean seen[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0;i<n;i++) l.add(new ArrayList<>());
        for(int i [] : e) {
            l.get(i[0]).add(i[1]);
            l.get(i[1]).add(i[0]);
        }
        long ans =0, itr=0;
        for(int i = 0;i<n;i++) {
            long count = 0;
            if(!seen[i]) {
                seen[i] = true;
                q.offer(i);
                while(q.size()!=0) {
                    count ++;
                    for(int v : l.get(q.poll())) {
                        if(seen[v]) continue;
                        seen[v] = true;
                        q.offer(v);
                    }
                }
            }
            ans += itr*count;
            itr +=count;
        }
        return ans;
    }
}