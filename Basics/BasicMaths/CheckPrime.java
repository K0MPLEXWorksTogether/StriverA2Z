package Basics.BasicMaths;

public class CheckPrime {
    public boolean checkPrime(int n) {
        int count = 0;

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;

                if (i != n / i) {
                    count++;
                }
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CheckPrime prime = new CheckPrime();
        System.out.println(prime.checkPrime(5));
    }
}
