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

    public String findFromArray(String[] words){

        if(words == null || words.length ==0) return "";

        String prefix = words[0];

        for(int i=1; i< words.length; i++ ){

            if(!words[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                i=0;
            }
        }

        return prefix;
    }
























    public String findFromArray1(String[] array) {

        if (array.length == 0) {
            return "";
        }
        String prefix = array[0];

        for (int i = 1; i < array.length; i++) {
            if (!array[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                i = 0;
            }
        }
        return prefix;
    }

    public String findFromArrayIncremental(String[] array) {

        if (array.length == 0) return "";

        StringBuilder prefix = new StringBuilder();
        boolean exit = false;

        for (char c : array[0].toCharArray()) {

            prefix.append(c);
            for (int i = 1; i < array.length; i++) {
                if (!array[i].startsWith(prefix.toString())) {
                    exit = true;
                    break;
                }
            }

            if (exit) {
                prefix.deleteCharAt(prefix.length() - 1);
                break;
            }
        }
        return prefix.toString();
    }
}
