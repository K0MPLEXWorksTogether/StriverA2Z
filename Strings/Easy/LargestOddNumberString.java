package Strings.Easy;

public class LargestOddNumberString {
    public static String largestOddNumber(String num) {
        int length = num.length();
        for (int i = length - 1; i > -1; i--) {
            int digit = Integer.parseInt(num.substring(i, i + 1));
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
