package Basics.Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
