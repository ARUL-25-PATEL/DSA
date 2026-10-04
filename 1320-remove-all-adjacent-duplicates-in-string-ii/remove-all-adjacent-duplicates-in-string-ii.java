class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<el> st = new Stack<>();
        st.push(new el(s.charAt(0),1));
        for(int i = 1;i<s.length();i++) {
            char t = s.charAt(i);
            if(!st.isEmpty() && t==st.peek().x) {
                el temp = st.pop();
                st.push(new el(t, temp.feq+1));
            }else st.push(new el(t,1));

            if(st.peek().feq==k) st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            el temp = st.pop();
            for(int i = 0;i<temp.feq;i++) sb.append(temp.x);
        }
        return sb.reverse().toString();
    }
    class el{
        char x ;
        int feq;
        el(char x, int feq) {
            this.x = x;
            this.feq = feq;
        }
    }
}