class Solution {
    public boolean validDigit(int n, int x) {
        if(x==n) return false; 
        boolean find = false;
        int last = -1;
        while(n!=0){
            int temp = n%10;
            if(temp==x) find = true;
            last = temp;
            n/=10;
        }
        return last!=x && find;

    }
}