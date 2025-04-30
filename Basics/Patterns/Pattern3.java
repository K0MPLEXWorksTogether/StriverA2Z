package Basics.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }
}