package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem9Solver extends ProblemSolver<Integer> {
    @Override
    public Result solve(Input<Integer> input) {
        int sum=input.getInput();
        assert sum>3;

        for (int i = sum; i >0 ; i--) {
            for (int j = i-1; j > 0; j--) {
                for (int k = j-1; k >0; k--) {
                    if((i+j+k)==sum&&isPythagoreanTriplet(k, j, i)){
                        return new Result(String.format("%d",i*j*k));
                    }
                }
            }
        }


        return new Result(String.format("No Pythagorean Triplet (a,b,c) found with a+b+c=%d",sum));
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        assert a>0&&b>0&&c>0;
        return (c * c) == ((a * a) + (b * b));
    }

    public static void main(String[] args) {
        System.out.println(new Problem9Solver().solve(807).getSolution());
    }
}
