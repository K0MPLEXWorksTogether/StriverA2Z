package Strings.Easy;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveOuterParenthesis {
    public static String removeOuterParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Integer> indices = new ArrayList<>();
        StringBuilder removed = new StringBuilder();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                indices.add(i);
                continue;
            }

            if (arr[i] == '(' && stack.peek() == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    indices.add(i);
                }
            } else if (arr[i] == ')' && stack.peek() == '(') {
                stack.pop();
                if (stack.isEmpty()) {
                    indices.add(i);
                }
            } else {
                stack.push(arr[i]);
            }
        }

        for (int i = 1; i < indices.size(); i += 2) {
            removed.append(s.substring(indices.get(i - 1) + 1, indices.get(i)));
        }

        return removed.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(removeOuterParenthesis("(()())(())"));
    }
}
