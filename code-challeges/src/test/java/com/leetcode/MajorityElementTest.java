package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {

        assertEquals(3, MajorityElement.majorityElement(new int[]{3,2,3}));
    }

    @Test
    void majorityElement2() {
        assertEquals(2, MajorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}