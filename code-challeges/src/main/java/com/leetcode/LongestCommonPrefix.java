package com.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: array = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: array = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 *     1 <= array.length <= 200
 *     0 <= array[i].length <= 200
 *     array[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix {

    public String findFromArray(String[] array) {

        if(array.length ==0){
            return "";
        }
        String prefix=array[0];

        for(int i=1; i< array.length; i++){
            if(!array[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                i = 0;
            }
        }
        return prefix;
    }
}
