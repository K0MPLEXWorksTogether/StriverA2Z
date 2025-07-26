package LinkedList.Medium;

public class DanishNationalFlag {
    public static ListNode sortZeroOneAndTwo(ListNode head) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        ListNode curr = head;
        while (curr != null) {
            switch (curr.data) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                default:
                    break;
            }
            curr = curr.next;
        }

        ListNode dummy = new ListNode(-1);
        curr = dummy;

        while (count0-- > 0) {
            ListNode newNode = new ListNode(0);
            curr.next = newNode;
            curr = newNode;
        }

        while (count1-- > 0) {
            ListNode newNode = new ListNode(1);
            curr.next = newNode;
            curr = newNode;
        }

        while (count2-- > 0) {
            ListNode newNode = new ListNode(2);
            curr.next = newNode;
            curr = newNode;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 2 -> 1 -> 0 -> 2 -> 1 -> 0
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(0);

        System.out.println("Original list:");
        printList(head);

        ListNode sortedHead = sortZeroOneAndTwo(head);

        System.out.println("Sorted list:");
        printList(sortedHead);
    }
}
