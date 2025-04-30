package Basics.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
