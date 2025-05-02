package Basics.BasicRecursion;

public class FunctionalSumOfN {
    public int sumOfN(int n) {
        if (n <= 0) {
            return n;
        }

        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        FunctionalSumOfN sum = new FunctionalSumOfN();
        System.out.println(sum.sumOfN(5));
    }
}
