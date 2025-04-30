package Basics.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int start = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", start);
                start++;
            }
            System.out.println();
        }
    }
}
