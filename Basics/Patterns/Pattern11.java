package Basics.Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int start = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (start == 1) {
                    System.out.printf("1 ");
                    start = 0;
                } else if (start == 0) {
                    System.out.printf("0 ");
                    start = 1;
                }
            }
            
            System.out.println();
        }
    }    
}
