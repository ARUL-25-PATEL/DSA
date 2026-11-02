class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        PriorityQueue<el> pq  = new PriorityQueue<>((a,b)-> b.val-a.val);
        int n = values.length,ans=0;
        for(int i = 0;i<n;i++) pq.add(new el(values[i], labels[i]));
        HashMap<Integer,Integer> map = new HashMap<>();
        while(numWanted>0){
            if(pq.size()==0) return ans;
            el t = pq.poll();
            map.putIfAbsent(t.label,0);
            map.put(t.label,map.get(t.label)+1);
            if(map.get(t.label)>useLimit) continue;
            ans += t.val;
            numWanted--;
        }
        return ans;


    }
    class el{
        int val;
        int label;
        el(int val, int label) {
            this.val = val;
            this.label = label;
        }
    }
}