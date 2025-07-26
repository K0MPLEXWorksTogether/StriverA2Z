package LinkedList.Medium;

import java.util.HashSet;

public class IntersectionOfLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy = new ListNode(-1);
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = headA;

        while (curr != null) {
            set.add(curr);
            curr = curr.next;
        }

        curr = headB;
        while (curr != null) {
            if (set.contains(curr)) {
                dummy.next = curr;
                return dummy.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}

/*
 * Optimization: If you take two pointers, place them on seperate lists, and
 * iterate through the lists, and shilf the pointer to another list when it
 * becomes null, there will come a point where these two pointers meet. This is
 * the intersection point.
 */