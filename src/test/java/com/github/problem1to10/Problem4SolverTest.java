package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem4SolverTest {

    @Test
    void testPalindormic(){
        Assertions.assertFalse(Problem4Solver.isPalindromic(3));
        Assertions.assertTrue(Problem4Solver.isPalindromic(33));
        Assertions.assertTrue(Problem4Solver.isPalindromic(9009));
    }

    @Test
    void testSolve(){
        Assertions.assertEquals("9009",new Problem4Solver().solve(2).getSolution());
    }
}
