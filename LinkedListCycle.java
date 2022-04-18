
public class LinkedListCycle
{
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode f = head, s = head;
        while(f != null && f.next != null){
            if(f.next != s){
                f = f.next.next;
                s = s.next;
            }
            else
                return true;
        }
        return false;    }
}