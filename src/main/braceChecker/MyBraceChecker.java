package main.braceChecker;

import java.util.Stack;

public class MyBraceChecker {
    public boolean isValid(String braces) {
        // Add code here
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '[') {
                stk.push(braces.charAt(i));
            } else {
                if (!stk.empty() &&
                        ((stk.peek() == '(' && braces.charAt(i) == ')') ||
                                (stk.peek() == '{' && braces.charAt(i) == '}') ||
                                (stk.peek() == '[' && braces.charAt(i) == ']'))) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return stk.empty();
    }
}
