package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementArrayTest {

    @Test
    void majorityElement3() {
        assertEquals(Arrays.asList(3), MajorityElementArray.majorityElement(new int[]{3,2,3}));
    }
}