package com.github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumberGenerator {
    public static Long[] getPrimeNumbersSmallerThanWithErastothenes(int number){
        assert number>1;
        List<Long> primes=new ArrayList<>();
        boolean[] checkedNumbers=new boolean[number];
        Arrays.fill(checkedNumbers,true);

        long squareRoot=(long)Math.floor(Math.sqrt(number))+1;
        for (int i = 2; i < squareRoot; i++) {
            if(checkedNumbers[i]){
                for (int j = i*i; j < number; j+=i) {
                    checkedNumbers[j]=false;
                }
            }
        }
        for (int i = 2; i < number; i++) {
            if(checkedNumbers[i]){
                primes.add((long) i);
            }

        }
        return primes.toArray(new Long[0]);
    }
    public static List<Long> getPrimeNumbersSmallerThanWithSegmentedErastothenes(Long number){
        int segmentSize= (int) (Math.floor(Math.sqrt(number))+1);
        List<Long> primes = new LinkedList<>(Arrays.asList(getPrimeNumbersSmallerThanWithErastothenes(segmentSize)));
        List<Long> allPrimes = new LinkedList<>(primes);
        long lowerBound=segmentSize;
        long upperBound=segmentSize* 2L;


        //do single segment
        while (lowerBound<number){
            if(upperBound>=number){
                upperBound=number;
            }

            boolean[] checkedNumbers =new boolean[segmentSize+1];
            Arrays.fill(checkedNumbers,true);

            for (Long currentPrime : primes) {
                int loLim = (int) (Math.floor(lowerBound / currentPrime) * currentPrime);
                if (loLim < lowerBound)
                    loLim += currentPrime;

                for (int j = loLim; j < upperBound; j += currentPrime) {
                    checkedNumbers[(int) (j - lowerBound)] = false;
                }
            }
            for (long i = lowerBound; i<upperBound; i++){
                if (checkedNumbers[(int) (i - lowerBound)]){
                    allPrimes.add(i);
                }
            }

            // Update low and high for next segment
            lowerBound  = lowerBound + number;
            upperBound = upperBound + number;
        }


        return allPrimes;
    }
}
