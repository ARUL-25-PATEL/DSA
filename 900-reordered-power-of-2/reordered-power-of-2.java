class Solution {
    public boolean reorderedPowerOf2(int n) {
        int feq[] = new int[10];
        int t = n;
        while(t!=0) {
            int x = t%10;
            feq[x]++;
            t/=10;
        }
        long pow = 1;
        while(pow<=Integer.MAX_VALUE){
            int feq2[]  = new int[10];
            long temp = pow;
            while(temp!=0) {
                 int x = (int) temp%10;
                 feq2[x]++;
                 temp/=10;
            }
            boolean flag = true;
            for(int i = 0;i<10;i++) if(feq[i]!=feq2[i]) flag = false;
            if(flag) return flag;
            pow = pow*2;
        }
        return false;

    }
}