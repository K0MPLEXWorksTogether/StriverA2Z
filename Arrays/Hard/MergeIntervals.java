package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        int[] current = intervals[0];

        for (int[] interval : intervals) {
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = interval;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
