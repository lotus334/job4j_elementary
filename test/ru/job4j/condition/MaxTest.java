package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void twoIsBiggerThanOne() {
        int expected = 2;
        int left = 2;
        int right = 1;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void threeIsLessThanFour() {
        int expected = 4;
        int left = 3;
        int right = 4;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void fiveAndFiveAreEquals() {
        int expected = 5;
        int left = 5;
        int right = 5;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}