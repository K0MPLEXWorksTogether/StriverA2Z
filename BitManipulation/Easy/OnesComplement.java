package BitManipulation.Easy;

public class OnesComplement {
    public static String onesComplement(String binary) {
        StringBuilder result = new StringBuilder();

        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String binary = "1100101"; 
        System.out.println("Original binary: " + binary);
        System.out.println("Ones' complement: " + onesComplement(binary));
    }
}
