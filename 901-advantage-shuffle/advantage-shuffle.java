class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> p2 = new PriorityQueue<>((a,b)->nums2[b]-nums2[a]);
        PriorityQueue<Integer> p3 = new PriorityQueue<>();
        int n = nums1.length;
        for(int i = 0;i<n;i++) {
            p1.add(nums1[i]);
            p2.add(i);
            p3.add(nums1[i]);
        }
        while(p2.size()!=0){
            int val = p1.peek();
            if(val<=nums2[p2.peek()]) nums1[p2.poll()] = p3.poll();
            else  nums1[p2.poll()] = p1.poll();
        }
        return nums1;

    }
    
}