package LinkedList.Medium;

public class SortLL {
    public static ListNode mergeLL(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        while (left != null) {
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }

        while (right != null) {
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }

        return dummy.next;
    }

    public static ListNode sortLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortLL(head);
        ListNode right = sortLL(slow);

        return mergeLL(left, right);
    }
}
