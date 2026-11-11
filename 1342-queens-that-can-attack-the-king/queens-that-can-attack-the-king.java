class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] q, int[] k) {

        Set<Pair<Integer, Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int[] queen : q) {
            set.add(new Pair<>(queen[0], queen[1]));
        }

        int[][] dir = {
            {-1, 0},  
            {1, 0},   
            {0, -1},  
            {0, 1},   
            {-1, -1}, 
            {-1, 1},  
            {1, -1},  
            {1, 1}    
        };

        for (int[] d : dir) {

            int i = k[0] + d[0];
            int j = k[1] + d[1];

            while (i >= 0 && i < 8 && j >= 0 && j < 8) {

                if (set.contains(new Pair<>(i, j))) {
                    list.add(Arrays.asList(i, j));
                    break;
                }

                i += d[0];
                j += d[1];
            }
        }

        return list;
    }
}