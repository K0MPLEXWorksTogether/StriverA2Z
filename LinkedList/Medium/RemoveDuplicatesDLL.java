package LinkedList.Medium;

public class RemoveDuplicatesDLL {
    public static DoublyListNode removeDuplicatesDLL(DoublyListNode head) {
        if (head == null || head.next == null)
            return head;

        DoublyListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                DoublyListNode nextNode = curr.next.next;
                curr.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = curr;
                }
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
