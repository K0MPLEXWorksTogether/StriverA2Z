package BinarySearch.Hard;

public class DDaysPackages {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int weight : weights) {
            sum += weight;
            max = Math.max(max, weight);
        }

        int left = max;
        int right = sum;

        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDeliver(weights, days, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public boolean canDeliver(int[] weights, int days, int capacity) {
        int load = 0;
        int accountedDays = 1;
        for (int weight : weights) {
            if (weight + load > capacity) {
                load = weight;
                accountedDays++;
            } else {
                load += weight;
            }
        }

        if (accountedDays <= days) {
            return true;
        } else {
            return false;
        }
    }
}
