package Basics.Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n * 2; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                    System.out.printf(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= (2 * n) - i; j++) {
                    System.out.printf("*");
                }
                for (int j = 1; j <= (2 * (i - n)); j++) {
                    System.out.printf(" ");
                }
                for (int j = 1; j <= (2 * n) - i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
