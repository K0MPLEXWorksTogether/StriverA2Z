package LinkedList.Hard;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = -1;
        next = null;
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateLL {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode tail = head;
        int length = 0;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;
        if (k == 0)
            return head;

        tail.next = head;
        ListNode newTail = head;
        int steps = length - k;
        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
