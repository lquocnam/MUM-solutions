package com.solution.jan_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
 * For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5 is not in the array.
 * Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isBalanced (int [ ] a);
 * If you are programming in C or C++, the function signature is
 * int isBalanced(int a[ ], int len) where len is the number of elements in the array.
 */
public class Question3 {

    private static boolean containsAll(List<Integer> set, int[] a) {
        for (int i = 0; i < set.size(); i++) {
            if(!containItsPositive(set.get(i), a)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containItsPositive(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if((n*(-1)) == a[i]) {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> negativeNumbers(int[] a) {
        List<Integer> negativeNumbers = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negativeNumbers.add(a[i]);
            }
        }
        return negativeNumbers;
    }

    public static int isBalanced(int[] a) {
        List<Integer> negativeNumbers = negativeNumbers(a);
        return (containsAll(negativeNumbers, a)) ? 1 : 0;
    }
}
