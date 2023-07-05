package com.projects;

import java.util.Stack;

// runtime complexity is O(n)
public class BalancedParentheses {
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> openingStack = new Stack<>();
        Stack<Character> closingStack = new Stack<>();

        for (char ch : str.toCharArray()) { // loop through each char in the string
            if (ch == '(') {
                openingStack.push(ch);
            } else if (ch == ')') {
                closingStack.push(ch);
            }
        }
        return openingStack.size() == closingStack.size();
    }
}
