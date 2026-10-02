class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        s.append('(');
        fun(a,s,n-1,n);
        return a;
    }
    void fun(ArrayList<String> a, StringBuilder s, int o , int c){
        if(o>c|| o==-1 || c==-1) return ;
        if(o==0 && c==0) {
            a.add(s.toString());
            return ;
        }
        
            s.append('(');
            fun(a,s,o-1,c);
            s.deleteCharAt(s.length()-1);
        
            s.append(')');
            fun(a,s,o,c-1);
            s.deleteCharAt(s.length()-1);
        
    }
}