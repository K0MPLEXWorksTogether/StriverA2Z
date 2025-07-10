package LinkedList.Easy;

public class LengthOfLoop {
    public static int length(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            count++;
            fast = fast.next;
        }
        return count;
    }
    public static int lengthOfLoop(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return length(slow, fast);
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return 0;
    }
}