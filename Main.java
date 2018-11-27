package com.company;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          Point Point = new Point();
          System.out.println("enter point's X coordinate");
          Point.x = scanner.nextInt();
          System.out.println("enter point's Y coordinate");
          Point.y = scanner.nextInt();
          Point.coordinates();
          Point.tobegin();
          System.out.println("Enter skolko zhelaete add k X");
          Point.a = scanner.nextInt();
          System.out.println("Enter skolko zhelaete add k Y");
          Point.b = scanner.nextInt();
          Point.add();

          System.out.println("Enter line's first point's coordinates ");
          Line.x1 = scanner.nextInt();
          Line.y1 = scanner.nextInt();
          System.out.println("Enter line's second point's coordinates ");
          Line.x2 = scanner.nextInt();
          Line.y2 = scanner.nextInt();
          Line line = new Line();
          Line.coordinates();
          Line.length();
          Line.checkpoint();
          Line.oxangle();

          System.out.println("Enter broken's first point's coordinates ");
          BrokenLine.x1 = scanner.nextInt();
          BrokenLine.y1 = scanner.nextInt();
          System.out.println("Enter broken's second point's coordinates ");
          BrokenLine.x2 = scanner.nextInt();
          BrokenLine.y2 = scanner.nextInt();
          System.out.println("Enter broken's third point's coordinates ");
          BrokenLine.x3 = scanner.nextInt();
          BrokenLine.y3 = scanner.nextInt();
          BrokenLine brokenLine = new BrokenLine();
          BrokenLine.coordinates();
          BrokenLine.angle();
          BrokenLine.check();

     }

}