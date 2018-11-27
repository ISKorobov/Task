package com.company;

public class BrokenLine extends Line {
    BrokenLine broken = new BrokenLine();
    public int x3, y3;

    public BrokenLine (int x1, int y1, int x2, int y2) {
        super.x1 = line.x1;
        super.y1 = line.y1;
        super.x2 = line.x2;
        super.y2 = line.y2;
        System.out.println("Third point's coordinates");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
    }
    @Override
    public BrokenLine coordinates() {

        return broken;
    }

    public void angle() {
        double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        double Angle;
        Angle = (a*a + b*b - c*c) / 2 * a * c;
        Angle = Math.acos(Angle);
        Angle = Angle * 90 / Math.PI;
        System.out.println("Angle line otnositel'no OX is " + Angle);
    }

    public boolean check() {
        if( (Line.checkpoint(x1, y1, x2, y2)) == false) {
            Line.checkpoint(x2, y2, x3, y3);
        } else {
            return true;
        }
    }

}
