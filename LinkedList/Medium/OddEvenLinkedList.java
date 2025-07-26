package LinkedList.Medium;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyEven = new ListNode(-1);
        ListNode dummyOdd = new ListNode(-1);
        ListNode currEven = dummyEven;
        ListNode currOdd = dummyOdd;

        ListNode curr = head;
        boolean isOdd = true;
        while (curr != null) {
            if (isOdd) {
                isOdd = false;
                currOdd.next = curr;
                currOdd = curr;
            } else {
                isOdd = true;
                currEven.next = curr;
                currEven = curr;
            }

            curr = curr.next;
        }

        currEven.next = null;
        currOdd.next = dummyEven.next;
        return dummyOdd.next;
    }
}
