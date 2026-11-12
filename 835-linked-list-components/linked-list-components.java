/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] num) {
        int n = num.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : num) set.add(x);
        int count = 0,ans=0;
        ListNode t = head;
        while(t!=null) {
            if(set.contains(t.val)) count++;
            else count = 0;
            ans += count ==1 ? 1:0;
            t = t.next;
        }
        return ans;
    }
}