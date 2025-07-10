package BinarySearch.Medium;

public class NthRoot {
    public int checkRoot(int n, int m, int mid) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= mid;
            if (ans > m) {
                return 2;
            }
        }

        if (ans == m) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int nthRoot(int n, int m) {
        int left = 1, right = m;

        while (left <= right) {
            int mid = (left + right) / 2;
            switch (checkRoot(n, m, mid)) {
                case 1:
                    return mid;
                case 0:
                    left = mid + 1;
                    break;
                case 2:
                    right = mid - 1;
                    break;
                default:
                    break;
            }
        }
        
        return -1;
    }
}
