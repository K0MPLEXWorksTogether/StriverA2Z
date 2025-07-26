package LinkedList.Easy;

public class DoublyLinkedList {
    DoublyNode head;
    int size;

    public DoublyLinkedList(int data) {
        head = new DoublyNode(data);
        size = 1;
    }

    public void printLinkedList() {
        if (head == null) {
            return;
        }
        DoublyNode curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.data);
        }
        System.out.println();
    }
    
    public void insertNewHead(int data) {
        DoublyNode newHead = new DoublyNode(data);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
        size++;
    }

    public void insertAfterHead(int data) {
        DoublyNode newNode = new DoublyNode(data);
        newNode.prev = head;
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    public void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    public boolean search(int data) {
        DoublyNode curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public void deleteTail() {
        if (head == null || head.next == null) {
            return;
        }

        DoublyNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        DoublyNode newTail = curr.prev;
        newTail.next = null;
        curr.prev = null;
    }
    
    public void deleteHead() {
        if (head == null || head.next == null) {
            return;
        }

        DoublyNode newHead = head.next;
        newHead.prev = null;
        head.next = null;
        head = newHead;
    }

    public void reverse() {
        DoublyNode prev = null;
        DoublyNode curr = head;
        DoublyNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }
}
