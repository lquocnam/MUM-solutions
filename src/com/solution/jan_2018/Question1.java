package com.solution.jan_2018;

import java.util.ArrayList;
import java.util.List;

/**
 * An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n.
 * For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12.
 * But 18 is not an even subset of 32 because 6 is not a factor of 32.
 * Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, otherwise it returns 0.
 */
public class Question1 {

    private static List<Integer> evenFactorsOfGivenNumber(int n) {
        List<Integer> evenFactors = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(n % i == 0 && i % 2 == 0) {
                evenFactors.add(i);
            }
        }
        return evenFactors;
    }

    private static boolean containsAll(List<Integer> set, List<Integer> subSet) {
        for (int i = 0; i < subSet.size(); i++) {
            if(!contain(subSet.get(i), set)) {
                return false;
            }
        }
        return true;
    }

    private static boolean contain(Integer n, List<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            if(n.equals(set.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int isEvenSubset(int m, int n) {
        List<Integer> evenFactorsOfM = evenFactorsOfGivenNumber(m);
        List<Integer> evenFactorsOfN = evenFactorsOfGivenNumber(n);
        return containsAll(evenFactorsOfN, evenFactorsOfM) ? 1 : 0;
    }
}
