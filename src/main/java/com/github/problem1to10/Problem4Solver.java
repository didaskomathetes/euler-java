package com.github.problem1to10;

import com.github.Input;
import com.github.ProblemSolver;
import com.github.Result;

public class Problem4Solver extends ProblemSolver<Integer> {




    public static boolean isPalindromic(int number){
        String numberAsString=String.valueOf(number);
        int length=numberAsString.length();
        if(length%2!=0){
            return false;
        }
        for (int i = 0; i < length/2; i++) {
            if(numberAsString.charAt(i)!=numberAsString.charAt(length-i-1)){
                return false;
            }
        }

        return true;
    }

    @Override
    public Result solve(Input<Integer> input) {
        int largestPalindrome=0;
        if(input.getInput()<1){
            throw new RuntimeException("Invalid Input: Input should be positive integer > 0 ");
        }
        int power= (int) Math.pow(10,input.getInput());
        for (int i = 0; i < power; i++) {
            for (int j = 0; j < power; j++) {
                int product=i*j;
                if(isPalindromic(product)&&product>largestPalindrome){
                    largestPalindrome=product;
                }
            }
        }


        return new Result(largestPalindrome);
    }

    public static void main(String[] args) {
        Problem4Solver problem4Solver=new Problem4Solver();
        System.out.println(problem4Solver.solve(3));
    }
}
