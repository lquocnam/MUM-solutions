package com.solution.jan_2018;

/**
 * A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
 * For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5 is not in the array.
 * Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isBalanced (int [ ] a);
 * If you are programming in C or C++, the function signature is
 * int isBalanced(int a[ ], int len) where len is the number of elements in the array.
 */
public class TestQuestion3 {

    public static void main(String... args) {
        int result = Question3.isBalanced(new int[]{-2, 3, 2, -3});
        if(result == 1) System.out.println("given array is balanced");

        result = Question3.isBalanced(new int[]{-2, 2, 2, 2});
        if(result == 1) System.out.println("given array is balanced");

        result = Question3.isBalanced(new int[]{-5, 2, -2});
        if(result == 0) System.out.println("given array is not balanced");
    }
}
