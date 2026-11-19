class Solution {
    public boolean carPooling(int[][] t, int c) {
        Arrays.sort(t,(a,b)-> a[1]-b[1]);
        int pick = 0,idx=0;
        PriorityQueue<Integer> l = new PriorityQueue<>((a,b)-> t[a][2]-t[b][2]);
        for(int i = 0;i<t.length;i++){
            while(l.size()!=0 && t[l.peek()][2]<=t[i][1]) pick -= t[l.poll()][0];
            pick+=t[i][0];
            if(pick>c) return false;
            l.add(i);
        }
        return true;
    }
}