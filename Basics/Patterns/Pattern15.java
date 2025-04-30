package Basics.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int startChar = 'A';

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", startChar + j);
            }
            System.out.println();
        }
    }
}
