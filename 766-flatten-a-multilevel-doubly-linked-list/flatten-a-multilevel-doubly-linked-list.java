/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head,next=head;
        while(temp !=null) {
            if(temp.child!=null) {
                next = temp.next;
                temp.next =  temp.child;
                temp.child.prev = temp;
                Node x = dfs(temp.child);
                x.next = next;
                if(next!=null) next.prev = x;
                temp.child = null;
            }
            temp = temp.next;
        }
        return head;
    }
    Node dfs(Node head){
        if(head.next==null) return head;
        return dfs(head.next);
    }
}