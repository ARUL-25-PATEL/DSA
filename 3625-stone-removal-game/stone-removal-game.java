class Solution {
    public boolean canAliceWin(int n) {
        int i = 10;
        while(i!=0 && n!=0){
            if(i>n) return false;
            else {
                n-=i;
            }
            i--;
            if(i>n) return true;
            else {
                n-=i;
            }
            i--;
        }
        return false;
    }
}