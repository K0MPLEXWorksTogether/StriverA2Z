package Basics.BasicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        ReverseANumber reverse = new ReverseANumber();
        int n = 12321;

        int reversed = reverse.reverse(n);
        if (reversed == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
