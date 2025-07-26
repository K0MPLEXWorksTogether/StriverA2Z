package LinkedList.Medium;

public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        next = null;
    }

    public ListNode(int data, ListNode nextNode) {
        this.data = data;
        this.next = nextNode;
    }
}
