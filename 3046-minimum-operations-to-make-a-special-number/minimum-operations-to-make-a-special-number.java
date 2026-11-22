class Solution {
    public int minimumOperations(String num) {
        int case25 = fun(num,'2','5');
        int case00 = fun(num,'0','0');
        int case75 = fun(num,'7','5');
        int case50 = fun(num,'5','0');
        int finalans = Math.min(Math.min(case00,case25),Math.min(case50,case75));
        int zero=0,n=num.length();
        for(char x : num.toCharArray()) if(x=='0') zero++;
        return Math.min(finalans,n-zero);
    }
    int fun(String s, char a, char b){
        int count = 0,n=s.length();
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)==b) return count+fun2(s,i-1,a);
            count++; 
        }
        return 10000;
    }
    int fun2(String s, int i, char a){
        int count = 0;
        while(i>=0){
            if(s.charAt(i)==a) return count;
            count++;
            i--;
        }
        return 10000;
    }
}