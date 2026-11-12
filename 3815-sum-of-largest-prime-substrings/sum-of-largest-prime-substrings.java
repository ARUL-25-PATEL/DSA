class Solution {
    public long sumOfLargestPrimes(String s) {
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = s.length();
        long sum = 0;
        for(int i = 0;i<n;i++) for(int j = i;j<n;j++) {
            long num = Long.parseLong( s.substring(i,j+1));
            if(!set.contains(num) && fun(num)) pq.add(num);
            if(pq.size()>3) pq.poll();
            set.add(num);
        }
        for(long x : pq) sum+=x;
        return sum;
    }
    boolean fun(long num){
        if(num<=1) return false;
        if(num<=3) return true;
        if(num%2==0 || num%3==0) return false;
        for(long i = 5;i*i<=num;i+=6) if (num % i == 0 || num % (i + 2) == 0) return false;
        return true;
    }
}

