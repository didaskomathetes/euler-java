package com.github;

import java.util.Objects;

public class Result {
    private final String solution;

    public Result(Object solution) {
        this.solution = solution.toString();
    }

    public String getSolution() {
        return solution;
    }

    @Override
    public String toString(){
        return getSolution();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return getSolution().equals(result.getSolution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSolution());
    }

}
