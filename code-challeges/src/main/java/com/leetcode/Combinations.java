package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 *
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * Example 2:
 *
 * Input: n = 1, k = 1
 * Output: [[1]]
 *
 *
 */

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {

        Set<String> foundNumbers = new HashSet<String>();
        List<List<Integer>> result = new ArrayList();
        List<Integer> temporalNumbers;
        String key="";

        for(int i=1; i<=n; i++){

            temporalNumbers = new ArrayList<Integer>();
            temporalNumbers.add(i);

            for(int j=1; j<=k; j++){
                if( j==i) continue;

                temporalNumbers.add(j);
            }

            if(temporalNumbers.size()>1){
                key = getKey(temporalNumbers);
                if(!foundNumbers.contains(key)){
                    foundNumbers.add(key);
                    result.add(temporalNumbers);
                }
            }
        }

        return result;
    }

    private static String getKey( List<Integer> list){
        Collections.sort(list);
        return list.toString();
    }


}
