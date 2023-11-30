package com.egor.train.task2;
import java.util.*;
import static com.egor.train.task2.MyUtil.Util.UpSize;

public class MainTask2 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the size: ");
            String[] formats = {"B", "KB", "MB", "GB", "TB", "PB"};
            Pair<Double, Integer> size = new Pair<>();
            size.first = in.nextDouble();
            size.second = 0;
            size = UpSize(size.first, size.second);
            System.out.printf("%.1f ", size.first);
            System.out.print(formats[size.second]);
        }
    }
}