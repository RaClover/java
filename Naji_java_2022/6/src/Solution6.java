public class Solution6 {

    /*
    * Given the head of a sorted linked list,
    * delete all duplicates such that each element
    * appears only once. Return the linked list sorted as well.*/

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode p = head.next;

        while(p != null){
            if(p.val == prev.val){
                prev.next = p.next;
                p = p.next;
            }
            else{
                prev = p;
                p = p.next;
            }
        }

        return head;
    }
}
