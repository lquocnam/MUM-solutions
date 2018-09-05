package com.solution.jan_2018;


/**
 * An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n.
 * For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12.
 * But 18 is not an even subset of 32 because 6 is not a factor of 32.
 * Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, otherwise it returns 0.
 */
public class TestQuestion1 {

    public static void main(String... args) {

        int result = Question1.isEvenSubset(18, 12);
        if(result == 1) System.out.println("factors of 18 is even subset of factors of 12");

        result = Question1.isEvenSubset(18, 32);
        if(result == 0) System.out.println("factors of 18 is not even subset of factors of 32");
    }
}
