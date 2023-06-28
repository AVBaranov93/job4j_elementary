package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when21To25Then4() {
        Point point1 = new Point(2, 1);
        Point point2 = new Point(2, 5);
        double expected = 4;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To51Then4() {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(1, 1);
        double expected = 4;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To11Then0() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        double expected = 0;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111To211Then1() {
        Point point1 = new Point(1, 1, 1);
        Point point2 = new Point(2, 1, 1);
        double expected = 1;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111To111Then0() {
        Point point1 = new Point(1, 1, 1);
        Point point2 = new Point(1, 1, 1);
        double expected = 0;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}