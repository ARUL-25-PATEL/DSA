class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            num--;
            int n = Math.min(9,sum);
            sb.append(n);
            sum -= n;
        }
        if(sum!=0) return "";
        return sb.toString();
    }
}