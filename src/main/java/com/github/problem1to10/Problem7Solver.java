package com.github.problem1to10;

import com.github.Input;
import com.github.PrimeNumberGenerator;
import com.github.ProblemSolver;
import com.github.Result;

import java.util.List;

public class Problem7Solver extends ProblemSolver<Integer> {
    @Override
    public Result solve(Input<Integer> input) {
        int order=input.getInput();
        assert order>0;
        long upperBound= (long) Math.pow(order,2);
        return new Result( getprimeWithOrder(order, upperBound));
    }

    private Long getprimeWithOrder(int order, long upperBound) {
        while (upperBound >0){
            List<Long> primeNumbers=PrimeNumberGenerator.getPrimeNumbersSmallerThanWithSegmentedErastothenes(upperBound);
            if(primeNumbers.size()>= order){
                return primeNumbers.get(order-1);
            }
            upperBound*=upperBound;
        }
        throw  new RuntimeException("PrimeSearchFailed");
    }

    public static void main(String[] args) {
        System.out.println(new Problem7Solver().solve(10001));
    }
}
