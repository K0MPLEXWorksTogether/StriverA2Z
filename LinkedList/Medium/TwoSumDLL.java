package LinkedList.Medium;

import java.util.ArrayList;

public class TwoSumDLL {
    public static ArrayList<ArrayList<DoublyListNode>> twoSumSortedLL(DoublyListNode head, int target) {
        ArrayList<ArrayList<DoublyListNode>> answers = new ArrayList<>();
        DoublyListNode left = head;

        DoublyListNode right = head;
        while (right.next != null) {
            right = right.next;
        }

        while (left != null && right != null && left != right && right.next != left) {
            int sum = left.val + right.val;
            if (sum == target) {
                ArrayList<DoublyListNode> pair = new ArrayList<>();
                pair.add(right);
                pair.add(left);
                answers.add(pair);

                left = left.next;
                right = right.prev;
            } else if (sum > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }

        return answers;
    }
}
