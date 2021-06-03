package com.github.problem1to10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.PrimeNumberGenerator.getPrimeNumbersSmallerThanWithErastothenes;
import static com.github.PrimeNumberGenerator.getPrimeNumbersSmallerThanWithSegmentedErastothenes;

class Problem3SolverTest {

    @Test
    void solveTest() {
        Problem3Solver problem3Solver=new Problem3Solver();
        Assertions.assertEquals("29",problem3Solver.solve(13195L).getSolution());
        Assertions.assertEquals("6857",problem3Solver.solve(600851475143L).getSolution());

    }

    @Test
    void testSimpleErastothenes() {
        Assertions.assertArrayEquals(new Long[]{2L,3L,5L,7L},getPrimeNumbersSmallerThanWithErastothenes(10));
        Assertions.assertArrayEquals(new Long[]{2L,3L,5L,7L,11L},getPrimeNumbersSmallerThanWithErastothenes(12));
        Assertions.assertArrayEquals(new Long []{2L,3L,5L,7L,11L,13L,17L,19L,23L,29L,31L},getPrimeNumbersSmallerThanWithErastothenes(32));
        Assertions.assertArrayEquals(new Long []{2L,3L,5L,7L,11L,13L,17L,19L,23L,29L},getPrimeNumbersSmallerThanWithErastothenes(31));
    }

    @Test
    void testSegmentedErastothenes() {
        Assertions.assertArrayEquals(new Long[]{2L,3L,5L,7L},getPrimeNumbersSmallerThanWithSegmentedErastothenes(10L).toArray());
        Assertions.assertArrayEquals(new Long[]{2L,3L,5L,7L,11L},getPrimeNumbersSmallerThanWithSegmentedErastothenes(12L).toArray());
        Assertions.assertArrayEquals(new Long []{2L,3L,5L,7L,11L,13L,17L,19L,23L,29L,31L},getPrimeNumbersSmallerThanWithSegmentedErastothenes(32L).toArray());
        Assertions.assertArrayEquals(new Long []{2L,3L,5L,7L,11L,13L,17L,19L,23L,29L},getPrimeNumbersSmallerThanWithSegmentedErastothenes(31L).toArray());
    }
}