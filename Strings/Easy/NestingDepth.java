package Strings.Easy;

import java.util.Stack;

public class NestingDepth {
    public static int maxDepth(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int maxStackSize = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
                maxStackSize = Math.max(maxStackSize, stack.size());
            } else if (arr[i] == ')') {
                stack.pop();
            }
        }
        
        return maxStackSize;
    }
}
