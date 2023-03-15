package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to22then2() {
        Point a = new Point(2, 4);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to22to10then2() {
        Point a = new Point(2, 4);
        Point b = new Point(2, 2);
        Point c = new Point(1, 0);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20to33then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        Point c = new Point(3, 3);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }
}