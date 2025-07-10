package Strings.Easy;

import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> ROMAN_VALUES = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = ROMAN_VALUES.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = ROMAN_VALUES.get(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
