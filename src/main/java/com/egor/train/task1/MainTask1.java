package com.egor.train.task1;
import com.egor.train.task1.utils.MyUtil;

import java.util.*;

public class MainTask1 {

    public static void main (String[] args) {
        Point a = new Point(),
              b = new Point(),
              c = new Point();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first point: ");
        a.SetX(in.nextDouble());
        a.SetY(in.nextDouble());
        System.out.print("Enter the second point: ");
        b.SetX(in.nextDouble());
        b.SetY(in.nextDouble());
        System.out.print("Enter the third point: ");
        c.SetX(in.nextDouble());
        c.SetY(in.nextDouble());
        System.out.print("S = " + MyUtil.STriangle(a, b, c));
        in.close();
    }
}
