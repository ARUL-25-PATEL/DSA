class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char a = s.charAt(i);
            if(a=='(' || a=='{' || a=='[') st.push(a);
            else{
                if(st.size()==0) return false;
                char top = st.pop();
                if ((a == ')' && top != '(') ||
                    (a == '}' && top != '{') ||
                    (a == ']' && top != '[')) {
                    return false;
            }
        }
    }
        return st.isEmpty();
}}