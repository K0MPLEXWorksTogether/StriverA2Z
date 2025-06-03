package Arrays.Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                count = 1;
                while (set.contains(++num)) {
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
    
    public static void main(String[] args) {
        int[] test = { 3, 8, 5, 7, 6 };
        System.out.println("Longest Consecutive Sequence Length: " + longestSequence(test));
    }
}
