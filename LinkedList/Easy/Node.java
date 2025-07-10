package LinkedList.Easy;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node nextNode) {
        this.data = data;
        this.next = nextNode;
    }
}
