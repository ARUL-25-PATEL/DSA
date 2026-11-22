class Solution {
    public int minSwaps(String s) {
        char arr[] = s.toCharArray();
        int zero = fun(arr,true);
        int one = fun(arr,false);
       if(zero==-1) return one;
       if(one==-1) return zero;
       return Math.min(zero,one);
    }
    int fun(char arr[], boolean flag){
        int zero=0,one=0;
        for(int i = 0;i<arr.length;i++){
            if(flag){
                if(i%2==0 && arr[i]!='0') zero++;
                if(i%2==1 && arr[i]!='1') one++;
            } 
            else {
                 if(i%2==1 && arr[i]!='0') zero++;
                if(i%2==0 && arr[i]!='1') one++;
            }
            
        }
        if(zero!=one) return -1;
        return zero;
    }
}