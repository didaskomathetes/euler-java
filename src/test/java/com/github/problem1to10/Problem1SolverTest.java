package com.github.problem1to10;


import com.github.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Problem1SolverTest {

    @Test
    void solveTest() {
        Problem1Solver problem1Solver=new Problem1Solver();
        Assertions.assertEquals("23",problem1Solver.solve(10).getSolution());
        Assertions.assertEquals("33",problem1Solver.solve(11).getSolution());
        Assertions.assertEquals("233168",problem1Solver.solve(1000).getSolution());
    }
}