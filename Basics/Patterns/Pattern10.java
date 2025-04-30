package Basics.Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        boolean isIncreasing = true;
        int last = 2 * n - 1;
        int half = last / 2;

        for (int i = 0; i < last; i++) {
            if (i > half) {
                isIncreasing = false;
            } 

            if (isIncreasing) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j <= last - i - 1; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
