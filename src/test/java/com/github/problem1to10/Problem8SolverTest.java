package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem8SolverTest {

    @Test
    void testSolution(){
        Problem8Solver problem8Solver=new Problem8Solver();
        Assertions.assertEquals("81", problem8Solver.solve(2).getSolution());
        Assertions.assertEquals("648", problem8Solver.solve(3).getSolution());
        Assertions.assertEquals("5832", problem8Solver.solve(4).getSolution());

    }
}
