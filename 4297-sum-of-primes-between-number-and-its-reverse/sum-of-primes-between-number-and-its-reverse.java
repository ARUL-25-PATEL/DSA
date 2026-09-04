class Solution {
    public int sumOfPrimesInRange(int n) {
        int m = 0,temp = n;
        while(temp!=0){
            m *=10;
            m+=temp%10;
            temp/=10;
        }
        int num1 = Math.min(n,m),num2=Math.max(n,m),ans=0;
        for(int i = num1;i<=num2;i++){
            if(fun(i)) ans+=i;
        }
        return ans;

    }
    boolean fun(int x){
        if (x == 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0)
                return false;
        }
        return true;

    }
    
}