class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        int n = h.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 1; i < n; i++) {
            if(h[i-1] >= h[i]) continue;

            int diff = h[i] - h[i-1];

            if(diff <= b) {
                b -= diff;
                pq.add(diff);
            }
            else if(l > 0) {
                if(pq.size() == 0) {
                    l--;
                }
                else if(pq.peek() <= diff) {
                    l--;
                }
                else {
                    b += pq.poll();
                    b -= diff;
                    pq.add(diff);
                    l--;
                }
            }
            else return i-1;
        }

        return n-1;
    }
}