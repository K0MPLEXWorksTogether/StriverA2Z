package StacksAndQueues.Learning;

import LinkedList.Easy.Node;

public class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList(int headData) {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (!isEmpty()) {
            int popped = top.data;
            top = top.next;
            
        }
    }
}
