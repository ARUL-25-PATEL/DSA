class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push('(');
            else {
                if(st.peek()=='('){
                    int sum = 1;
                    st.pop();
                    if(st.size()>0 && st.peek()!='(' ) {
                    sum += st.pop()-'0';
                    }
                    st.push((char)(sum+'0'));
                }else {
                    int x = st.pop()-'0';
                    st.pop();
                    int sum = ((x*2));
                    if(st.size()>0 && st.peek()!='(' ) {
                    sum += st.pop()-'0';
                    }
                    st.push((char)(sum+'0'));
                }
            }
        }
        return st.pop()-'0';
    }
}