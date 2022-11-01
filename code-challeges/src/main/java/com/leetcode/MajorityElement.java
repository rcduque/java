package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        int maxValue =0;
        int maxKey =0;

        for(Integer num: nums){
            if(numbersMap.containsKey(num)){
                numbersMap.put(num, numbersMap.get(num) +1 );

                if(numbersMap.get(num) > maxValue){
                    maxValue = numbersMap.get(num);
                    maxKey = num;
                }

            } else{
                numbersMap.put(num, 1);
            }
        }
        return maxKey;
    }

    public static int majorityElement2(int[] nums) {

        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        int maxValue =0;
        int maxKey =0;

        for(Integer num: nums){
            if(numbersMap.containsKey(num)){
                numbersMap.put(num, numbersMap.get(num) +1 );
            } else{
                numbersMap.put(num, 1);
            }
        }

        for(Entry<Integer,Integer> entry: numbersMap.entrySet()){
            if(entry.getValue()>maxValue){
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }
}
