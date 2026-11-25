class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);
            if (distA == distB) {
                return -a + b; 
            }
            return -distA + distB; 
        });

        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k)
                pq.poll();
        }
        ArrayList<Integer> l = new ArrayList<>();
        while (pq.size() != 0)
            l.add(pq.poll());
        Collections.sort(l);
        return l;
    }
}