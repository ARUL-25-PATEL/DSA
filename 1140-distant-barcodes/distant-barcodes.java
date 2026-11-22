class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : barcodes) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for(int x : map.keySet()) {
            pq.add(x);
        }

        int n = barcodes.length;
        int idx = 0;

        while(!pq.isEmpty()) {
            int x = pq.poll();

            for(int i = 0; i < map.get(x); i++) {
                barcodes[idx] = x;
                idx += 2;

                if(idx >= n) {
                    idx = 1;
                }
            }
        }

        return barcodes;
    }
}