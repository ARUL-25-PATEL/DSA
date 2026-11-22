class Solution {
    public String maximumNumber(String num, int[] c) {
        char arr[] = num.toCharArray();
        int n = arr.length;
        for(int i =0 ;i<n;i++) {
            int x = (int)arr[i]-'0';
            if(x>=c[x]) continue;
            int j = i;
            while(j<n) {
                x = (int)arr[j]-'0';
                if(x>c[x]) break;
                arr[j] = (char) ('0'+c[x]);
                j++;
            }
            break;
        }
        return new String(arr);
    }
}