package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem5Solver extends ProblemSolver<Integer> {
    @Override
    public Result solve(Input<Integer> input) {
        int highestDivisor=input.getInput();
        int currentNumber=highestDivisor;
        while (currentNumber>0){
            if(isEvenlyDivisibleByAll(currentNumber,highestDivisor)){
                return new Result(currentNumber);
            };
            currentNumber+=highestDivisor;
        }

        return null;
    }

    public static boolean isEvenlyDivisibleByAll(int currentNumber, int highestDivisor) {
        for (int i = highestDivisor; i >1; i--) {
            if(currentNumber%i!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Problem5Solver().solve(20));
    }
}
