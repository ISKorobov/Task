package com.company;

public class Point {
    public int x,  y;
    Point point = new Point(x, y);

    public Point(int xf, int yf){
        this.x = xf;
        this.y = yf;
    }

    public Point coordinates () {

        return point;
    }

    public double tobegin () {
        double a = x * x + y * y;
        double len = Math.sqrt(a);
        return len;
    }

    public Point add (int a, int b) {
        x += a;
        y += b;
        return point;
    }
}
