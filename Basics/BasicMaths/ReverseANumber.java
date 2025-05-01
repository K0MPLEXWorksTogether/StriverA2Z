package Basics.BasicMaths;

public class ReverseANumber {
    public int reverse(int n) {
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        ReverseANumber reverse = new ReverseANumber();
        System.out.println(reverse.reverse(12345));
    }
}
