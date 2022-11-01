package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MajorityElementArray {

    public static List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        Set<Integer> maxKeys = new HashSet<Integer>();
        int limit = nums.length/3;

        for(Integer num: nums){
            if(numbersMap.containsKey(num)){
                numbersMap.put(num, numbersMap.get(num) +1 );
            } else{
                numbersMap.put(num, 1);
            }

            if(numbersMap.get(num) > limit){
                maxKeys.add(num);
            }
        }

        return new ArrayList<Integer>(maxKeys);
    }
}
