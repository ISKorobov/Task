package com.company;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter point's coordinates ");
          Point Point = new Point(scanner.nextInt(), scanner.nextInt());
          Point.coordinates();
          Point.tobegin();

          System.out.println("Enter line's coordinates ");;
          Line line = new Line(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
          Line.coordinates();
          Line.length();
          Line.checkpoint();
          Line.oxangle();

          System.out.println("Enter broken's coordinates ");
          BrokenLine brokenLine = new BrokenLine(scanner.nextInt(), scanner.nextInt(),
                  scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
          BrokenLine.coordinates();
          BrokenLine.angle();
          BrokenLine.check();

     }

}
