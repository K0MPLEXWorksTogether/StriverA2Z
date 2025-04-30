package Basics.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        char startChar = 'A';
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c", startChar + j);
            }
            System.out.println();
        }
    }
}
