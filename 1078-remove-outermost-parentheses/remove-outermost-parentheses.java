class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) result.append(c);
                open++;
            } else {
                open--;
                if (open > 0) result.append(c);
            }
        }
        return result.toString();
    }
}