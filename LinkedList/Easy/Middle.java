package LinkedList.Easy;

public class Middle {
    public Node findMiddle(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && slow != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
    }
}
