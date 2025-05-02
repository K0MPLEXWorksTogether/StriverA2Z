package Basics.BasicRecursion;

public class OneToN {
    public void printToN(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        printToN(i + 1, n);
    }

    public static void main(String[] args) {
        OneToN oneToN = new OneToN();
        oneToN.printToN(1, 10);
    }
}