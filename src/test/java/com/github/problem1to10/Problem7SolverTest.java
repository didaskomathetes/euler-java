package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem7SolverTest {

    @Test
    void testSolution(){
        Problem7Solver problem7Solver=new Problem7Solver();
        Assertions.assertEquals("13",problem7Solver.solve(6).getSolution());
        Assertions.assertEquals("17",problem7Solver.solve(7).getSolution());
    }
}
