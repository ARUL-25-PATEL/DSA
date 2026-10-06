class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char x : s.toCharArray()){
            if(x=='(') st.push('(');
            else {
                if(st.isEmpty()) count++;
                else st.pop();
            }
        }
        return st.size()+count;
    }
}