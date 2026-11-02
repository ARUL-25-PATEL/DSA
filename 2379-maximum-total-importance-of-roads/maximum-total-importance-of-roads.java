class Solution {
    public long maximumImportance(int n, int[][] r) {
        int feq[] = new int[n];
        for(int i[] : r) {
            feq[i[0]]++;
            feq[i[1]]++;
        }
        PriorityQueue<el> pq = new PriorityQueue<>((a,b)-> -a.feq+b.feq);
        long ans=0;
        for(int i = 0;i<n;i++) pq.add(new el(i,feq[i]));
        while(n>0){
            ans += (pq.poll().feq)*(long)n;
            n--;
        }

        return  ans;

    }
    class el{
        int val;
        int feq;
        el(int val, int feq) {
            this.val  = val;
            this.feq = feq;
        }
    }
}