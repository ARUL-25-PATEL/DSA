class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int arr[] = {0};
        fun(set, sb, s, 0, 0, 0, arr);
        return new ArrayList<>(set);
    }

    void fun(Set<String> set, StringBuilder sb, String s, int idx, int open, int close, int arr[]) {
        if(open < close) return;
        if(idx == s.length()) {
            if(open != close) return;
            String temp = sb.toString();
            if(temp.length() < arr[0]) return;
            if(temp.length() > arr[0]) {
                set.clear();
                arr[0] = temp.length();
            }
            set.add(temp);
            return;
        }
        char x = s.charAt(idx);
        sb.append(x);
        if(x != '(' && x != ')') {
            fun(set, sb, s, idx + 1, open, close, arr);
            sb.deleteCharAt(sb.length() - 1);
        } 
        else if(x == '(') {
            fun(set, sb, s, idx + 1, open + 1, close, arr);
            sb.deleteCharAt(sb.length() - 1);
            fun(set, sb, s, idx + 1, open, close, arr);
        } 
        else {
            fun(set, sb, s, idx + 1, open, close + 1, arr);
            sb.deleteCharAt(sb.length() - 1);
            fun(set, sb, s, idx + 1, open, close, arr);
        }
    }
}