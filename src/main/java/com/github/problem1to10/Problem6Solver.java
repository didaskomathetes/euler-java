package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem6Solver extends ProblemSolver<Integer> {
    @Override
    public Result solve(Input<Integer> input) {
        int bound=input.getInput();
        int squareOfSum=0;
        int sumOfSquares=0;
        for (int i = 1; i <=bound; i++) {
            squareOfSum+=i;
            sumOfSquares+=Math.pow(i,2);
        }
        squareOfSum= (int) Math.pow(squareOfSum,2);

        return new Result(squareOfSum-sumOfSquares);
    }

    public static void main(String[] args) {
        System.out.println(new Problem6Solver().solve(200));
    }

}
