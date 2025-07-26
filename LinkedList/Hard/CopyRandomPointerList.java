package LinkedList.Hard;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        next = null;
        random = null;
    }
}

public class CopyRandomPointerList {
    public static Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node dummy = new Node(-1);
        Node dummyCurr = dummy;
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            map.put(curr, newNode);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node currCopy = map.get(curr);
            currCopy.next = map.get(curr.next);
            currCopy.random = map.get(curr.random);

            curr = curr.next;
            dummyCurr.next = currCopy;
            dummyCurr = currCopy;
        }

        return dummy.next;
    }
}

/*
 * Optimization: Traverse the original linked list, and create a copy of the
 * current value as the next value. Then traverse the original list again. If
 * the curr has a random pointer, then set it to curr.random.next. Disconnect
 * the previous links and return the new LL.
 */