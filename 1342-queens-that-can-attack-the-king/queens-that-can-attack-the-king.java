class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] q, int[] k) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i[] : q) set.add(new Pair<>(i[0],i[1]));
        for(int i = k[0]+1;i<8;i++) {
            if(set.contains(new Pair<>(i,k[1]))) {
               list.add(new ArrayList<>(Arrays.asList(i, k[1])));
               break;
            }
        } 
        for(int i = k[1]+1;i<8;i++) {
            if(set.contains(new Pair<>(k[0],i))) {
               list.add(new ArrayList<>(Arrays.asList(k[0], i)));
               break;
            }
        } 

        for(int i = k[0]-1;i>=0;i--) {
            if(set.contains(new Pair<>(i,k[1]))) {
               list.add(new ArrayList<>(Arrays.asList(i, k[1])));
               break;
            }
        } 
        for(int i = k[1]-1;i>=0;i--) {
            if(set.contains(new Pair<>(k[0],i))) {
               list.add(new ArrayList<>(Arrays.asList(k[0], i)));
               break;
            }
        } 

        int i = k[0]+1,j=k[1]+1;
        while(i<8 && j<8) {
            if(set.contains(new Pair<>(i,j))) {
               list.add(new ArrayList<>(Arrays.asList(i, j)));
               break;
            }
            i++;
            j++;
        }
        i = k[0]-1;
        j=k[1]-1;
        while(i>=0 && j>=0) {
            if(set.contains(new Pair<>(i,j))) {
               list.add(new ArrayList<>(Arrays.asList(i, j)));
               break;
            }
            i--;
            j--;
        }
        i = k[0]-1;
        j=k[1]+1;
        while(i>=0 && j<8) {
            if(set.contains(new Pair<>(i,j))) {
               list.add(new ArrayList<>(Arrays.asList(i, j)));
               break;
            }
            i--;
            j++;
        }
        i = k[0]+1;
        j=k[1]-1;
        while(i<8 && j>=0) {
            if(set.contains(new Pair<>(i,j))) {
               list.add(new ArrayList<>(Arrays.asList(i, j)));
               break;
            }
            i++;
            j--;
        }
        return list;
    }
}