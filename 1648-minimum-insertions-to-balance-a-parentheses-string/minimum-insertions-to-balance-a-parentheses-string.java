class Solution {
    public int minInsertions(String s) {
       int open = 0,result=0;
       int i = 0,n=s.length();
       while(i<n){
            char x = s.charAt(i);
            if(x=='(') {
                open++;
                i++;
            }else {
                if(open==0){
                    open++;
                    result++;
                }
                else if(i+1<n && s.charAt(i)==s.charAt(i+1)){
                    open--;
                    i+=2;
                }else {
                    result++;
                    i++;
                    open--;
                }
            }
       }
       return open*2+result;
        
    }
}