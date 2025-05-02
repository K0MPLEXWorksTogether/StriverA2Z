package Basics.BasicRecursion;

public class BacktrackOneToN {
    public void backtrackOneToN(int i, int n) {
        if (i <= 0) {
            return;
        }

        backtrackOneToN(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        BacktrackOneToN test = new BacktrackOneToN();
        test.backtrackOneToN(3, 3);
    }
}
