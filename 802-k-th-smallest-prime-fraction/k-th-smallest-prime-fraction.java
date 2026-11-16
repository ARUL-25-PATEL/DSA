class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double x = (double) arr[i] / arr[j];

                pq.add(x);

                if (pq.size() > k) {
                    pq.remove();
                }
            }
        }

        double target = pq.peek();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((double) arr[i] / arr[j] == target) {
                    return new int[] { arr[i], arr[j] };
                }
            }
        }

        return new int[2];
    }
}