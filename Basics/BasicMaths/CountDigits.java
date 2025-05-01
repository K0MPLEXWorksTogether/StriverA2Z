package Basics.BasicMaths;

public class CountDigits {
    public int countDigits(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        CountDigits count = new CountDigits();
        System.out.println(count.countDigits(329825));
    }
}
