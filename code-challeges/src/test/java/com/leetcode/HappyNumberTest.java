package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        assertTrue(HappyNumber.isHappy(19));
    }

    @Test
    void isHappy2() {
        assertTrue(HappyNumber.isHappy(82));
    }

    @Test
    void isHappy3() {
        assertFalse(HappyNumber.isHappy(3));
    }
}