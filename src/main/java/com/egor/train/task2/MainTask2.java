package com.egor.train.task2;
import java.util.*;
public class MainTask2 {
    public static void main (String[] args) {
        System.out.print("Enter the size: ");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        int type = 1;
        while (n / 1024 >= 1) {
            n /= 1024;
            type++;
        }
        System.out.printf("%.1f", n);
        switch (type) {
            case 1: System.out.print(" B"); break;
            case 2: System.out.print(" KB"); break;
            case 3: System.out.print(" MB"); break;
            case 4: System.out.print(" GB"); break;
            case 5: System.out.print(" TB"); break;
        }
        in.close();
    }
}