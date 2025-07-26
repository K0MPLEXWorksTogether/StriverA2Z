package LinkedList.Medium;

public class Palindrome {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfStart = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean isPalindrome = true;
        while (p2 != null) {
            if (p1.data != p2.data) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return isPalindrome;
    }
}
