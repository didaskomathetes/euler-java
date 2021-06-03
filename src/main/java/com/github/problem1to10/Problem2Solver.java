package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem2Solver extends ProblemSolver<Integer> {

    private int fiboncacciCounter =0;
    private final Long[] numbers= new Long[2];

    @Override
    public Result solve(Input<Integer> input) {
        init();
        int bound=input.getInput();
        int evenSum=0;
        if(bound>0){
            long nextFiboNumber=0;
            while (nextFiboNumber<=bound){
                nextFiboNumber=getNextFibonacciNumber();
                if(nextFiboNumber%2==0){
                    evenSum+=nextFiboNumber;
                }
            }
        }
        return new Result(evenSum);
    }

    public long getNextFibonacciNumber(){
        long nextFibonacciNumber=0;
        if(fiboncacciCounter <2){
            nextFibonacciNumber= numbers[fiboncacciCounter];
        }
        else {
            long nextFiboNumber=numbers[0]+numbers[1];
            numbers[0]=numbers[1];
            numbers[1]=nextFiboNumber;
            nextFibonacciNumber= nextFiboNumber;
        }
        fiboncacciCounter++;
        return nextFibonacciNumber;
    }

    public void init(){
        numbers[0]=1L;
        numbers[1]=2L;
        fiboncacciCounter=0;
    }


    public static void main(String[] args) {
        Problem2Solver problem2Solver=new Problem2Solver();
        Result result=problem2Solver.solve(new Input<>(4000000));
        System.out.println(result.getSolution());
    }
}
