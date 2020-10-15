package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        int expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To34Then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43To21Then2828() {
        Point a = new Point(4, 3);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        double expected = 2.828;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0Min3ToMin40Then0() {
        Point a = new Point(0, -3);
        Point b = new Point(-4, 0);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }
}
