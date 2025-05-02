package Basics.BasicRecursion;

public class ParameterizedSumOfN {
    public void sumOfN(int n, int sum) {
        if (n <= 0) {
            System.out.println(sum);
            return;
        }

        sumOfN(n - 1, sum + n);
    }

    public static void main(String[] args) {
        ParameterizedSumOfN sum = new ParameterizedSumOfN();
        sum.sumOfN(5, 0);
    }
}
