package LinkedList.Medium;

import java.util.HashSet;

public class PositionOfLoop {
    public static ListNode positionOfLoop(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return curr;
            } else {
                set.add(curr);
            }
            curr = curr.next;
        }

        return null;
    }
}

/*
 * Optimization: Use slow-fast pointers to find if there is a loop. If there is
 * one, reset slow to head and increment slow and head by 1. The point at which
 * they meet is the position of the loop.
 */