package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem1Solver extends ProblemSolver<Integer> {
    public Result solve(Input<Integer> bound){
     int sumOfThreeAndFiveDivisors=0;
        for (int i = 1; i < bound.getInput(); i++) {
            if(i%3==0||i%5==0){
                sumOfThreeAndFiveDivisors+=i;
            }
        }
     return new Result(sumOfThreeAndFiveDivisors);
    }

    public static void main(String[] args) {
        Problem1Solver problem1Solver=new Problem1Solver();
        System.out.println(problem1Solver.solve(new Input<>(1000)));
    }

}
