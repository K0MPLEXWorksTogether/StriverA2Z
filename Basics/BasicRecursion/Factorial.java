package Basics.BasicRecursion;

public class Factorial {
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial test = new Factorial();
        System.out.println(test.factorial(5));
    }
}
