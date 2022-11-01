package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    public void testRemoveElementExample1(){
        assertEquals(2, RemoveElement.removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    public void testRemoveElementExample2(){
        assertEquals(5,
                RemoveElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}