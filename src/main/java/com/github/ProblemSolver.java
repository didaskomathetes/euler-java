package com.github;

public abstract class ProblemSolver<R> {

    public abstract Result solve(Input<R>input );

    public Result solve(R input){
        return solve(new Input<>(input));
    }
}
