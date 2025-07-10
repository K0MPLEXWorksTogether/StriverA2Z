package BitManipulation.Easy;

public class TwosComplement {

    
    public static String twosComplement(String binary) {
        String onesComplement = onesComplement(binary);
        return addOneToBinaryString(onesComplement);
    }

    private static String onesComplement(String binary) {
        StringBuilder result = new StringBuilder();

        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                result.append('1');
            } else if (bit == '1') {
                result.append('0');
            } else {
                throw new IllegalArgumentException("Input string contains non-binary characters.");
            }
        }

        return result.toString();
    }

    private static String addOneToBinaryString(String binary) {
        StringBuilder result = new StringBuilder(binary);
        int length = binary.length();

       
        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '0') {
                result.setCharAt(i, '1');
                return result.toString(); 
            } else {
                result.setCharAt(i, '0'); 
            }
        }

        result.insert(0, '1');
        return result.toString();
    }

    public static void main(String[] args) {
        String binary = "1100101"; // Example binary string
        System.out.println("Original binary: " + binary);
        System.out.println("Two's complement: " + twosComplement(binary));
    }
}
