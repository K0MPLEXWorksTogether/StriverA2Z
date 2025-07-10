package BinarySearch.Medium;

public class SquareRoot {
    public int squareRoot(int n) {
        int left = 0, right = n, ans = 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid <= n) {
                ans = Math.max(mid, ans);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return ans;
    }
}
