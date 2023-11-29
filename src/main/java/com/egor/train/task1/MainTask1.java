package com.egor.train.task1;
import java.util.*;
public class MainTask1 {
    static class Point {
        double x;
        double y;
    }
    public static void main (String[] args) {
        Point a = new Point(), b = new Point(), c = new Point();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first point: ");
        a.x = in.nextDouble();
        a.y = in.nextDouble();
        System.out.print("Enter the second point: ");
        b.x = in.nextDouble();
        b.y = in.nextDouble();
        System.out.print("Enter the third point: ");
        c.x = in.nextDouble();
        c.y = in.nextDouble();
        System.out.print("S = " + Math.abs((b.x - a.x)*(c.y-a.y)-(c.x-a.x)*(b.y-a.y))/2);
    }
}