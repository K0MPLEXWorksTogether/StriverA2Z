package Basics.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }

            int breakPoint = (2 * i + 1) / 2;
            int startChar = 'A';
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= breakPoint) {
                    System.out.printf("%c", startChar);
                    startChar++;
                } else {
                    System.out.printf("%c", startChar);
                    startChar--;
                }
            }
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }

            System.out.println();
        }
    }
}
