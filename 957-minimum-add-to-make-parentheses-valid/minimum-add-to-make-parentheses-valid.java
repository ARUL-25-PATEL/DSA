class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0,open=0;
        for(char x : s.toCharArray()){
            if(x=='(') open++;
            else {
                if(open==0) count++;
                else open--;
            }
        }
        return open+count;
    }
}