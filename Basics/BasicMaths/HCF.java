package Basics.BasicMaths;

public class HCF {
    public int highestCommonFactor(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        HCF Hcf = new HCF();
        int n1 = 15, n2 = 20;
        System.out.println(Hcf.highestCommonFactor(n1, n2));
    }
}