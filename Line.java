package com.company;

import java.util.Scanner;

public class Line extends Point {
    Scanner scanner = new Scanner(System.in);
    public int x1, y1, x2, y2, x0, y0;
    Line line = new Line(x1, y1, x2, y2);
    Point pointbeg = new Point();
    Point pointend = new Point();

    public Line (int x1, int y1, int x2, int y2) {
        line.pointbeg.x = x1;
        line.pointbeg.y = y1;
        line.pointend.x = x2;
        line.pointend.y = y2;
    }

    public Line coordinates() {

        return line;
    }

    public double length () {
        double Length;
        double a = x2 - x1;
        double b = y2 - y1;
        a = a * a;
        b = b * b;
        Length = Math.sqrt(a + b);
        return Length;
    }

   public double oxangle () {
        if(y1 > 0) {
            while(true){
                if(y1 == 0) {
                    break;
                }
                y1--;
                y2--;
            }
        } else {
            while(true){
                if(y1 == 0) {
                    break;
                }
                y1++;
                y2++;
            }
        }
        int x3 = y2, y3 = 0;
        double Angle, a = x3 - x1, b = y2 - y3, c;
        a = a * a;
        b = b * b;
        c = Math.sqrt(a + b);
        a = x3 - x1;
        b = y2 - y3;
        Angle = (a*a + b*b - c*c) / 2 * a * c;
        Angle = Math.acos(Angle);
        Angle = Angle * 90 / Math.PI;
       return Angle;
   }

   public boolean checkpoint () {
        if ( ((x0 - x1) / (x2 - x1)) == ((y0 - y1) / (x2 - x1))  ) {
            return true;
        } else {
            return false;
        }
   }

}
