package Basics.BasicRecursion;

public class Palindrome {
    public boolean palindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        } else {
            return palindrome(str, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String test = "racecar";
        System.out.println("Is palindrome? " + p.palindrome(test, 0, test.length() - 1));
    }
}
