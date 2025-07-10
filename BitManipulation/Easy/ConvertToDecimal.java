package BitManipulation.Easy;

public class ConvertToDecimal {
    public static int convertToDecimal(String binaryStr) {
        int decimalValue = 0;
        int length = binaryStr.length();

        
        for (int i = 0; i < length; i++) {
            char bit = binaryStr.charAt(i);
            if (bit == '1') {
                decimalValue += Math.pow(2, length - i - 1);
            }
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        String binaryStr = "111"; 
        System.out.println("Decimal value of binary " + binaryStr + " is: " + convertToDecimal(binaryStr));
    }
}
