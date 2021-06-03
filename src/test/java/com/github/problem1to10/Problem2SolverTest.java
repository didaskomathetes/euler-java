package com.github.problem1to10;

import com.github.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem2SolverTest {

    @Test
    void testFibonumberGenerator(){
        Problem2Solver problem2Solver=new Problem2Solver();
        Assertions.assertEquals(1,problem2Solver.getNextFibonacciNumber());
        Assertions.assertEquals(2,problem2Solver.getNextFibonacciNumber());
        Assertions.assertEquals(3,problem2Solver.getNextFibonacciNumber());
        Assertions.assertEquals(5,problem2Solver.getNextFibonacciNumber());
        Assertions.assertEquals(8,problem2Solver.getNextFibonacciNumber());
        Assertions.assertEquals(13,problem2Solver.getNextFibonacciNumber());

    }

    @Test
    void testSolver(){
        Problem2Solver problem2Solver=new Problem2Solver();
        Assertions.assertEquals("10",problem2Solver.solve(10).getSolution());
        Assertions.assertEquals("44",problem2Solver.solve(34).getSolution());
        Assertions.assertEquals("44",problem2Solver.solve(35).getSolution());
        Assertions.assertEquals("4613732",problem2Solver.solve(4000000).getSolution());
    }

}