package BinarySearch.Easy;

public class ImplementHigherBound {
    public static int higherBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] test = { 2, 3, 7, 10, 11, 11, 25 };
        System.out.println(higherBound(test, 11));
    }
}
