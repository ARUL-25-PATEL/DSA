class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        boolean seen[] = new boolean[upper+1];
        for(int i : nums) if(i<=upper) seen[i] = true;
       List<List<Integer>> ans = new ArrayList<>();
        while(lower<=upper) {
            int a = lower,b = lower;
            if(seen[a]){
                lower++;
                continue;
            }
            List<Integer> t = new ArrayList<>();
            while(lower<=upper && !seen[lower]) {
                b = lower;
                lower++;
            }
            t.add(a);
            t.add(b);
            ans.add(t);
            
        }
        return ans;
    }
}