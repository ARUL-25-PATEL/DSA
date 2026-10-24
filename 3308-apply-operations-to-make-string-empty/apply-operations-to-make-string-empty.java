class Solution {
    public String lastNonEmptyString(String s) {
        int max = 0;
        int feq[] = new int[26];
        for(char x : s.toCharArray()) {
            feq[x-'a']++;
            max = Math.max(max,feq[x-'a']);
        }
        for(int i = 0;i<26;i++) {
            if(feq[i]==max) feq[i] = 1;
            else feq[i] = 0;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--) {
            char x = s.charAt(i);
            if(feq[x-'a']==1) {
                sb.append(x);
                feq[x-'a'] = 0;
            }
        }
        return sb.reverse().toString();
    }
}