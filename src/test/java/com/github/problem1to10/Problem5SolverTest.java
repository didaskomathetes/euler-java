package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem5SolverTest {

    @Test
    void testIsDivisibale(){
        Assertions.assertTrue(Problem5Solver.isEvenlyDivisibleByAll(2520,10));
        Assertions.assertFalse(Problem5Solver.isEvenlyDivisibleByAll(2519,10));
    }

    @Test
    void testSolution(){
        Problem5Solver problem5Solver=new Problem5Solver();
        Assertions.assertEquals("2520",problem5Solver.solve(10).getSolution());
    }
}
