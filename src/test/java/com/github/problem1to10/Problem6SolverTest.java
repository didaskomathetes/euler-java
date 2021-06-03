package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem6SolverTest {

    @Test
    void testSolution(){
        Problem6Solver problem6Solver=new Problem6Solver();
        Assertions.assertEquals("2640",problem6Solver.solve(10).getSolution());
    }
}
