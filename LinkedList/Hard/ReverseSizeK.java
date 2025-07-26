package LinkedList.Hard;

public class ReverseSizeK {
    public static ListNode reverseKGroup(ListNode head, int k) {
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

            ListNode prev = null, curr = groupStart;
            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            prevHead.next = prev;
            groupStart.next = nextGroup;
            prevHead = groupStart;
        }

        return dummy.next;
    }
}
