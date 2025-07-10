package Recursion.Medium;

public class Pow {
    public static double pow(double x, int n) {
        double ans = 1.0;
        long y = n;
        if (y < 0) {
            y *= -1;
        }
        while (y > 0) {
            if (y % 2 == 0) {
                ans = ans * x;
                y--;
            } else {
                x *= x;
                n /= 2;
            }
        }

        return ans;
    }
}
