
public class reverselinkedlist
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode rever =  reverseList(head.next);
        if(rever == null) return head;
        
        head.next.next = head;
        head.next = null;
        return rever;
    }
}