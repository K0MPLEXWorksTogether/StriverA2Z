package LinkedList.Hard;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = -1;
        next = null;
        child = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.child = null;
    }

    ListNode(int val, ListNode next, ListNode child) {
        this.val = val;
        this.next = next;
        this.child = child;
    }
}

public class FlattenLL {
    public static ListNode mergeLL(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        while (left != null) {
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }

        while (right != null) {
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }

        return dummy.next;
    }

    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && slow != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode leftHalf = mergeSort(head);
        ListNode rightHalf = mergeSort(slow);

        return mergeLL(leftHalf, rightHalf);

    }
    
    public static ListNode flattenLL(ListNode head) {
        ArrayList<ListNode> heads = new ArrayList<>();
        ListNode dummy = new ListNode();
        ListNode dummyCurr = dummy;

        ListNode curr = head;
        while (curr != null) {
            heads.add(curr);
            curr = curr.next;
        }

        for (ListNode childHead : heads) {
            ListNode childCurr = childHead;
            while (childCurr != null) {
                dummyCurr.next = childCurr;
                dummyCurr = childCurr;
                childCurr = childCurr.child;
            }
        }

        return mergeSort(dummy.next);
    }
}
