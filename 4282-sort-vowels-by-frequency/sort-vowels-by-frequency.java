class Solution {
    public String sortVowels(String s) {
        int feq[] = new int[26];
        int idx[] = new int[26];
        Arrays.fill(idx,-1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((p, q) -> {
            if (feq[p] == feq[q])
                return idx[p] - idx[q];
            return feq[q] - feq[p];
        });

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            feq[x - 'a']++;
            if (idx[x - 'a'] == -1)
                idx[x - 'a'] = i;
        }

        for (char x : "aeiou".toCharArray())
            pq.add(x - 'a');

        ArrayList<Integer> v = new ArrayList<>();

        while (!pq.isEmpty() && feq[pq.peek()] != 0)
            v.add(pq.poll());

        StringBuilder sb = new StringBuilder();

        if (v.size() == 0)
            return s;

        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if ("aeiou".indexOf(x) != -1) {
                int r = v.get(p);

                char t = (char) ('a' + r);
                sb.append(t);

                feq[r]--;

                if (feq[r] == 0) {
                    p++;
                }
            } else {
                sb.append(x);
            }
        }

        return sb.toString();
    }
}