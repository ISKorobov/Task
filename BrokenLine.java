package com.company;

public class BrokenLine extends Line {
    public int x3, y3;
    BrokenLine broken = new BrokenLine(x1, y1, x2, y2, x3, y3);

    public BrokenLine (int x1, int y1, int x2, int y2, int x3, int y3) {
        super.x1 = x1;
        super.y1 = y1;
        super.x2 = x2;
        super.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public BrokenLine coordinates() {

        return broken;
    }

    public double angle() {
        double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        double Angle;
        Angle = (a*a + b*b - c*c) / 2 * a * c;
        Angle = Math.acos(Angle);
        Angle = Angle * 90 / Math.PI;
        return Angle;
    }

    public  boolean check() {
        if( (Line.checkpoint(x1, y1, x2, y2)) == false) {
            Line.checkpoint(x2, y2, x3, y3);
        } else {
            return true;
        }
    }

}
