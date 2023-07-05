package com.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    // runtime complexity is O(1)
    public static boolean hasBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPairs = createBracketPairs();

        for (char ch : str.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch, bracketPairs)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    // runtime complexity is O(n)
    private static Map<Character, Character> createBracketPairs() {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
        bracketPairs.put('<', '>');
        return bracketPairs;
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    private static boolean isMatchingPair(char openBracket, char closeBracket, Map<Character, Character> bracketPairs) {
        return bracketPairs.containsKey(openBracket) && bracketPairs.get(openBracket) == closeBracket;
    }
}
