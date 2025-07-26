package LinkedList.Medium;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;
        while (curr1 != null && curr2 != null) {
            int sum = curr1.data + curr2.data + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            int sum = curr1.data + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;

            curr1 = curr1.next;
        }

        while (curr2 != null) {
            int sum = curr2.data + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;

            curr2 = curr2.next;
        }

        if (carry != 0) {
            ListNode carryData = new ListNode(carry);
            curr.next = carryData;
        }

        return dummy.next;
    }
}
