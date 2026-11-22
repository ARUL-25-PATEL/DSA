class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int acount = 0,bcount=0;
        while(a!=0 || b!=0){
            if(a>=b && acount!=2 || bcount==2) {
                sb.append('a');
                a--;
                acount++;
                bcount=0;
            }else {
                sb.append('b');
                b--;
                bcount++;
                acount=0;
            }
        }
        return sb.toString();
    }
}