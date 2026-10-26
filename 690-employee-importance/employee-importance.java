/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> e, int id) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<e.size();i++) {
            Employee t = e.get(i);
            map.put(t.id,i);
        }
        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        q.offer(id);
        while(q.size()!=0){
            int x = q.poll();
            Employee t = e.get(map.get(x));
            ans += t.importance;
            for(int i : t.subordinates) q.offer(i);
        }
        return ans;
    }
}