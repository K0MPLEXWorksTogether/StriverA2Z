package LinkedList.Easy;

import java.util.List;
import java.util.Arrays;

public class SinglyLinkedList {
    Node head;
    int size;
    
    public SinglyLinkedList(int data) {
        head = new Node(data);
        size = 1;
    }

    public void insertNewHead(int newVal) {
        Node newNode = new Node(newVal);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public void insertAfterHead(int newVal) {
        if (head == null)
            return;
        Node newNode = new Node(newVal);
        newNode.next = head.next.next;
        head.next = newNode;
        size++;
    }

    public void deleteTail() {
        if (head == null || head.next == null) {
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        size--;
    }

    public void deleteAfterSearch(int data) {
        Node curr = head;
        while (curr.next.data != data) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    public void printSize() {
        System.out.println(size);
    }

    public boolean searchVal(int val) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == val) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;
            current = next;
        }

        head = prev; 
    }
    
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);

        SinglyLinkedList list = new SinglyLinkedList(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            list.insertNewHead(arr.get(i));
        }
        list.reverse();

        list.printLinkedList();
        System.out.println("5 In Linked List: " + list.searchVal(5));
    }
}