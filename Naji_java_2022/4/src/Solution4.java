public class Solution4 {
    /*
    * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     * */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f = head, s = head;
        for (int i = 0; i < n; i++) f = f.next;
        if (f == null) return head.next;
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return head;

    }

}
