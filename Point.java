package com.company;

public class Point {
    public int x,  y, a, b;
    Point point = new Point();

    public Point () {
        System.out.println("Enter point's coordinates ");
        point.x = x;
        point.y = y;
    }

    public Point coordinates () {

        return point;
    }

    public double tobegin () {
        double a = point.x * point.x + point.y * point.y;
        double len = Math.sqrt(a);
        return len;
    }

    public Point add () {
        point.x += a;
        point.y += b;
        return point;
    }
}