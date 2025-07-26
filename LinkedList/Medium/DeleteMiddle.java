package LinkedList.Medium;

public class DeleteMiddle {
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode slowPrev = head;

        while (fast != null && fast.next != null) {
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        slowPrev.next = slow.next;
        slow.next = null;
        return head;
    }
}
