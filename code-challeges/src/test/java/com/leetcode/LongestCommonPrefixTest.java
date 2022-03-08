package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void testFindFromArrayWithoutElements(){

        assertEquals("", longestCommonPrefix.findFromArray(new String[]{}));
    }

    @Test
    public void testFindFromArrayWithOneElement(){
        //input ["a"]
        //Expected "a"
        assertEquals("a", longestCommonPrefix.findFromArray(new String[]{"a"}) );
    }

    @Test
    public void testFindFromArray(){
        //input ["abcde","abcdefgh","abcdeijk"]
        //Expected "abcde"
        assertEquals("abcde", longestCommonPrefix.findFromArray(new String[]{"abcde","abcdefgh","abcdeijk"}));
    }

    @Test
    public void testFindFromArrayWithoutMatches(){
        //input ["abcd","efgh","ijkl"]
        //Expected ""
        assertEquals("", longestCommonPrefix.findFromArray(new String[]{"abcde","efgh","ijkl"}));
    }

}