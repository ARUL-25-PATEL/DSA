class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> e) {
        int feq[] = new int[n];
        for(List<Integer> x : e) feq[x.get(1)]++;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++) if(feq[i]==0) ans.add(i);
        return ans;
    }
}