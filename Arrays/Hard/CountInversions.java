package Arrays.Hard;

import java.util.ArrayList;

public class CountInversions {
    public int merge(int[] nums, int left, int mid, int right) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int count = 0, p1 = left, p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            if (nums[p1] > nums[p2]) {
                sorted.add(nums[p2]);
                count += (mid - p1 + 1);
                p2++;
            } else {
                sorted.add(nums[p1]);
                p1++;
            }
        }

        while (p1 <= mid) {
            sorted.add(nums[p1]);
            p1++;
        }

        while (p2 <= right) {
            sorted.add(nums[p2]);
            p2++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sorted.get(i);
        }

        return count;
    }

    public int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if (left >= right)
            return count;
        int mid = (left + right) / 2;
        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);
        count += merge(nums, left, mid, right);
        return count;
    }
}
