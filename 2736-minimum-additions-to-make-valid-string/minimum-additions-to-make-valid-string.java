class Solution {
    public int addMinimum(String word) {
        StringBuilder sb = new StringBuilder();
        for(char x : word.toCharArray()){
            if(sb.length()==0){
                if(x=='a') sb.append(x);
                else if(x=='b') sb.append("ab");
                else sb.append("abc");
            }else {
                char temp = sb.charAt(sb.length()-1);
                if(temp=='a'){
                    if(x=='b') sb.append('b');
                    else if(x=='c') sb.append("bc");
                    else sb.append("bca");
                }else if(temp=='b'){
                        if(x=='c') sb.append('c');
                        else if(x=='a') sb.append("ca");
                        else sb.append("cab");
                }else {
                        if(x=='c')sb.append("abc");
                        else if(x=='a')sb.append('a');
                        else sb.append("ab");
                }
            }
        }
        char temp = sb.charAt(sb.length()-1);
        if(temp=='a') sb.append("bc");
        else if(temp=='b') sb.append('c');
        return sb.length()-word.length();
    }
}