package com.projects;
import static com.projects.MissingNumber.findMissingNumber;
import static com.projects.BalancedParentheses.*;
import static com.projects.BalancedBrackets.*;


public class Main {
    public static void main(String[] args) {

        //check missing number

        int[] numArr = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumber(numArr, maxNum);
        if (missingNumber == 0) {
            System.out.println("There is no number missing.");
        } else {
            System.out.println("Missing number: " + missingNumber);
        }

        // check balanced parentheses
        String str = "((())())";

        boolean checkBalance = hasBalancedParentheses(str);
        System.out.print("Balanced String Result: " + checkBalance);

        // check for balanced brackets

        String str1 = "{([])}";
        String str2 = "{{[}]}";
        String str3 = "[(<>)]{}";
        String str4 = "([)]";

        boolean isBalanced1 = hasBalancedBrackets(str1);
        boolean isBalanced2 = hasBalancedBrackets(str2);
        boolean isBalanced3 = hasBalancedBrackets(str3);
        boolean isBalanced4 = hasBalancedBrackets(str4);

        System.out.println("Balanced String Result: " + isBalanced1);
        System.out.println("Balanced String Result: " + isBalanced2);
        System.out.println("Balanced String Result: " + isBalanced3);
        System.out.println("Balanced String Result: " + isBalanced4);
    }
}

// a queue utilizes first in first out instead of last in first out