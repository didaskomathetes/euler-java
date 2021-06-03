package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem9SolverTest {

    @Test
    void testPythagoreanTriplet(){
        Assertions.assertTrue(Problem9Solver.isPythagoreanTriplet(3,4,5));
    }
}
