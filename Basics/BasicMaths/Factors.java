package Basics.BasicMaths;

import java.util.ArrayList;

public class Factors {
    public ArrayList<Integer> factors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (i != n / i) {
                    divisors.add(n / i);
                }
            }   
        }

        return divisors;
    }

    public static void main(String[] args) {
        Factors Factors = new Factors();
        ArrayList<Integer> result = Factors.factors(36);
        System.out.println("Factors:");
        for (Integer num : result) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
