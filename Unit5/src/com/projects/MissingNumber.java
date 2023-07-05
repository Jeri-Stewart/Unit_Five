package com.projects;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class MissingNumber {
    public static int findMissingNumber(int[] numArr, int maxNum) {
        //ensure unique num values
        // runtime complexity is O(n)
        Set<Integer> set = Arrays.stream(numArr).boxed().collect(Collectors.toSet());

        // loop through set to check  if all numbers are present
        // runtime complexity is O(n)
        for (int i = 1; i <= maxNum; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return 0; // if no missing number
    }

    //alternative solution compare arr lengths
    //runtime complexity is O(1)
    public static int findMissingNumberTwo(int[] numArr, int maxNum) {
        //ensure unique num values
        Set<Integer> set = Arrays.stream(numArr).boxed().collect(Collectors.toSet());

        // loop through set to check  if all numbers are present
        if(set.size() < maxNum){
            return 0;
        }
        return maxNum; // if no missing number
    }

}
