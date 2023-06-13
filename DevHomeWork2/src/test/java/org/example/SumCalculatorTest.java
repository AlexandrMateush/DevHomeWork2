package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setClass() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSum1() {
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSum3(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSumZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}