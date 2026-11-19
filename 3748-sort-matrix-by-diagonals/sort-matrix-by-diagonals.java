class Solution {
    public int[][] sortMatrix(int[][] g) {
        int n = g.length,m=g[0].length;
        for(int i = m-1;i>0;i--){
            ArrayList<Integer> l = new ArrayList<>();
            int x = 0,y=i;
            while(x<n && y<m){
                l.add(g[x][y]);
                x++;
                y++;
            }
            Collections.sort(l);
            x=0;
            y=i;
            int idx = 0;
            while(x<n && y<m){
                g[x][y] = l.get(idx);
                x++;
                y++;
                idx++;
            }

        }
            for(int i = 0;i<n;i++){
            ArrayList<Integer> l = new ArrayList<>();
            int x = i,y=0;
            while(x<n && y<m){
                l.add(g[x][y]);
                x++;
                y++;
            }
            Collections.sort(l, Collections.reverseOrder());
            x=i;
            y=0;
            int idx = 0;
            while(x<n && y<m){
                g[x][y] = l.get(idx);
                x++;
                y++;
                idx++;
            }

        }
        return g;
    }
}