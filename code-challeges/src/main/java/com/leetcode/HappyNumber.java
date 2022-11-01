package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {

        Set<Integer> previousNumbers = new HashSet<Integer>();
        int nextNumber = 0;
        int evaluatedNumber = n;
        int mod;
        //19
        try {

            while (true){

                mod = evaluatedNumber % 10;
                nextNumber += mod * mod;
                evaluatedNumber = evaluatedNumber / 10;

                if (evaluatedNumber == 0 && nextNumber ==1) {
                    return true;
                } else if (evaluatedNumber == 0 && previousNumbers.contains(nextNumber)){
                    return false;
                } else if (evaluatedNumber == 0){
                    evaluatedNumber= nextNumber;
                    previousNumbers.add(nextNumber);
                    nextNumber = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            return false;
        }
    }

    public static boolean isHappy2(int n) {

        String[] numArray = String.valueOf(n).split("");

        int nextNumber = 0;

        try {
            for (String number : numArray) {
                nextNumber += (Integer.valueOf(number) * Integer.valueOf(number));
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            return false;
        }

        if (nextNumber == 1) return true;
        return isHappy(nextNumber);
    }

}
