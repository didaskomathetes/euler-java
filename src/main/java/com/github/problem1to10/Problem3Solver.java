package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

import java.util.*;

import static com.github.PrimeNumberGenerator.getPrimeNumbersSmallerThanWithSegmentedErastothenes;

public class Problem3Solver extends ProblemSolver<Long> {

    public Long getLargestPrimeFactorsFor(long number){
        long nanos=System.currentTimeMillis();
        List<Long> primeFactors= getPrimeNumbersSmallerThanWithSegmentedErastothenes(number);
        for (int i = primeFactors.size()-1; i >=0 ; i--) {
            Long primeNumber=primeFactors.get(i);
            if(number%primeNumber==0){
                System.out.printf("Result after %d millis: %d%n",(System.currentTimeMillis()-nanos),primeNumber);
                return primeNumber;
            }
        }

        return 0L;
    }



    @Override
    public Result solve(Input<Long> input) {
        return new Result(getLargestPrimeFactorsFor(input.getInput()));
    }

    public static void main(String[] args) {
        Problem3Solver problem3Solver=new Problem3Solver();
        System.out.println(problem3Solver.solve(600851475143L));
    }
}
