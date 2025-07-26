package LinkedList.Medium;

public class DeleteAllOccurances {
    public static DoublyListNode deleteAllOccurances(DoublyListNode head, int data) {
        while (head != null && head.val == data) {
            head = head.next;
        }

        DoublyListNode curr = head;
        while (curr != null) {
            if (curr.val == data) {
                DoublyListNode prev = curr.prev;
                DoublyListNode next = curr.next;

                if (prev != null)
                    prev.next = next;
                if (next != null)
                    next.prev = prev;
            }
            curr = curr.next;
        }

        while (head != null && head.val == data) {
            head = head.next;
        }
        return head;
    }
}
