class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> str = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(')
                open.push(i);
            else if (x == '*')
                str.push(i);
            else {
                if (open.isEmpty() && str.isEmpty())
                    return false;
                else if (open.isEmpty())
                    str.pop();
                else
                    open.pop();
            }
        }
        if (open.isEmpty())
            return true;
        if (str.isEmpty())
            return false;
        while (!open.isEmpty() && !str.isEmpty() && open.peek() < str.peek()) {
            str.pop();
            open.pop();
        }

        return open.isEmpty();
    }
}