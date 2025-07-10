package BitManipulation.Easy;

public class ConvertToBinary {
    public static String convertToBinary(int num) {
        StringBuilder binary = new StringBuilder();

        if (num == 0) {
            return "0";
        }

        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(11)); // Should print "111"
    }
}
