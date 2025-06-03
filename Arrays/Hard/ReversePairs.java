package Arrays.Hard;

import java.util.ArrayList;

public class ReversePairs {
    public int countPairsAndMerge(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) arr[i] > 2 * (long) arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int p1 = left, p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {
                temp.add(arr[p1++]);
            } else {
                temp.add(arr[p2++]);
            }
        }
        while (p1 <= mid)
            temp.add(arr[p1++]);
        while (p2 <= right)
            temp.add(arr[p2++]);

        for (int i = left; i <= right; i++) {
            arr[i] = temp.get(i - left);
        }

        return count;
    }

    public int countReversePairs(int[] nums, int left, int right) {
        int count = 0;
        if (left > right) {
            return count;
        }

        int mid = left + (right - left) / 2;
        count += countReversePairs(nums, left, mid);
        count += countReversePairs(nums, mid + 1, right);
        count += countPairsAndMerge(nums, left, mid, right);
        return count;
    }
    
    public int reversePairs(int[] nums) {
        return countReversePairs(nums, 0, nums.length - 1);
    }
}
