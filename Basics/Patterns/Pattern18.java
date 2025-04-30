package Basics.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char startChar = (char)('A' + n - 1);
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.printf("%c ", startChar - j);
            }
            System.out.println();
        }
    }
}
