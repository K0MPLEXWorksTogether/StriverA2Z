package LinkedList.Medium;

public class ReverseKNodes {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode reverseKNodes(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevHead = dummy;

        while (true) {
            ListNode kTh = prevHead;
            for (int i = 0; i < k && kTh != null; i++) {
                kTh = kTh.next;
            }
            if (kTh == null)
                break;

            ListNode groupStart = prevHead.next;
            ListNode nextGroup = kTh.next;
            ListNode reversed = reverse(groupStart);

            prevHead.next = reversed;
            groupStart.next = nextGroup;
            prevHead = groupStart;
        }

        return dummy.next;
    }
}
