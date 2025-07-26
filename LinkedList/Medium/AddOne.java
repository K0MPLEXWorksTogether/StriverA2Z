package LinkedList.Medium;

public class AddOne {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
    public static ListNode addOneHelper(ListNode head) {
        if (head == null) {
            ListNode newNode = new ListNode(1);
            return newNode;
        }

        if (head.data != 9) {
            head.data++;
            return head;
        } else {
            head.data = 0;
            head.next = addOneHelper(head.next);
        }

        return head;
    }

    public static ListNode addOne(ListNode head) {
        head = reverse(head);
        head = addOneHelper(head);
        head = reverse(head);
        return head;
    }
}
