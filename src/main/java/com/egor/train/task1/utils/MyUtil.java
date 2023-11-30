package com.egor.train.task1.utils;
import com.egor.train.task1.Point;
public class MyUtil {

    public static double STriangle(Point a, Point b, Point c) {
        return Math.abs((b.GetX() - a.GetX())
                       *(c.GetY()-a.GetY())-(c.GetX()-a.GetX())
                       *(b.GetY()-a.GetY()))/2;
    }

}
