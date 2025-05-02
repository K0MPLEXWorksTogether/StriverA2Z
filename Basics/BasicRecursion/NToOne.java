package Basics.BasicRecursion;

public class NToOne {
    public void nToOne(int i, int n) {
        if (i <= 0) {
            return;
        }

        System.out.println(i);
        nToOne(i - 1, n);
    }

    public static void main(String[] args) {
        NToOne test = new NToOne();
        test.nToOne(4, 4);
    }
}
