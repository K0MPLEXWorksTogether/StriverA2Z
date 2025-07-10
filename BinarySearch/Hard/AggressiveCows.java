package BinarySearch.Hard;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int left = 0;
        int right = stalls.length - 1;
        int min = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;
            
        }
    }
}
