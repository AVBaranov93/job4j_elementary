package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    public static void main(String[] args) {
        double result = new Point(2, 1).distance(new Point(2, 5));
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = new Point(3, 1).distance(new Point(5, 5));
        System.out.println("result (3, 1) to (7, 5) " + result);
    }
}
